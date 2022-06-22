import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CarService} from "../../service/car.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Type} from "../../model/type";
import {City} from "../../model/city";
import {TypeService} from "../../service/type.service";
import {CityService} from "../../service/city.service";

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  editForm: FormGroup;
  id: number;
  types: Type[] = [];
  cities: City[] = [];
  constructor(private activatedRouter: ActivatedRoute,
              private router: Router,
              private carService: CarService,
              private typeService: TypeService,
              private cityService: CityService) {

  }

  ngOnInit(): void {
    this.typeService.getAll();
    this.getCity();

    this.activatedRouter.paramMap.subscribe((paramMap: ParamMap) =>
      this.id = +paramMap.get('id'));
    console.log(this.id);
    const cars = this.getInfo(this.id);
  }

  private getType() {
    this.typeService.getAll().subscribe( type => {
      this.types = type;
    });
  }

  private getCity() {
    this.cityService.getAll().subscribe( city => {
      this.cities = city;
    });
  }

  private getInfo(id: number) {
    return this.carService.findById(id).subscribe(cars => {
      console.log(cars);
      this.editForm = new FormGroup({
        licensePlates: new FormControl(cars.licensePlates),
        email: new FormControl(cars.email, [ Validators.email]),
        phone: new FormControl(cars.phone, [Validators.pattern(/^(090|093|097)\d{7}$/)]),
        type: new FormControl(cars.type),
        name: new FormControl(cars.name),
        departure: new FormControl(cars.departure),
        destination: new FormControl(cars.destination),
        startTime: new FormControl(cars.startTime),
        endTime: new FormControl(cars.endTime)
      });
    })
  }

  updateInfo(id: number) {
    const cars = this.editForm.value;
    console.log(cars);
    // if (this.editForm.valid) {
      this.carService.updateInfo(id, cars).subscribe(() => {
        alert('Cập nhật thành công');
        this.ngOnInit();
        this.router.navigateByUrl('/list');
      }, error => {
        console.log(error);
      }, () => {
        this.ngOnInit();
      })
    // }
  }

  equals = (item1, item2) => {
    return item1 && item2 && item1.id === item2.id;
  }
}
