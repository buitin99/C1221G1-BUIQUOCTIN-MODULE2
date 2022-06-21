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
    this.activatedRouter.paramMap.subscribe((paramMap: ParamMap) =>
      this.id = +paramMap.get('id'));
    const cars = this.getInfo(this.id);
  }

  ngOnInit(): void {
    this.getCity();
    this.getType();
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
      this.editForm = new FormGroup({
        licensePlates: new FormControl(cars.licensePlates, [Validators.required]),
        email: new FormControl(cars.email, [Validators.required, Validators.email]),
        phone: new FormControl(cars.phone, [Validators.required, Validators.pattern(/^(090|093|097)\d{7}$/)]),
        type: new FormControl(cars.type.name, [Validators.required]),
        name: new FormControl(cars.name, [Validators.required]),
        departure: new FormControl(cars.departure.name, [Validators.required]),
        destination: new FormControl(cars.destination.name, [Validators.required]),
        startTime: new FormControl(cars.startTime, [Validators.required]),
        endTime: new FormControl(cars.endTime, [Validators.required])
      });
    })
  }

  updateInfo(id: number) {
    const cars = this.editForm.value;
    if (this.editForm.valid) {
      this.carService.updateInfo(id, cars).subscribe(() => {
        alert('Cập nhật thành công');
        this.ngOnInit();
        this.router.navigateByUrl('/list');
      }, error => {
        console.log(error);
      }, () => {
        this.ngOnInit();
      })
    }
  }
}
