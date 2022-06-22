import { Component, OnInit } from '@angular/core';
import {CarService} from "../../service/car.service";
import {CityService} from "../../service/city.service";
import {City} from "../../model/city";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {TypeService} from "../../service/type.service";
import {Type} from "../../model/type";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  constructor(private carService: CarService,
              private start: CityService,
              private type: TypeService) { }

  public from: City[] = [];
  public types: Type[] = [];


  ngOnInit(): void {
    this.getAllCity();
    this.getAllType();
    console.log(this.from);
    console.log(this.types);
  }
  createForm: FormGroup = new FormGroup({
    licensePlates: new FormControl('', [ Validators.required]),
    email: new FormControl('', [ Validators.email, Validators.required]),
    phone: new FormControl('', [Validators.pattern(/^(090|093|097)\d{7}$/), Validators.required]),
    type: new FormControl('', [Validators.required]),
    name: new FormControl('', [Validators.required]),
    departure: new FormControl('', [Validators.required]),
    destination: new FormControl('', [Validators.required]),
    startTime: new FormControl('', [Validators.required]),
    endTime: new FormControl('', [Validators.required])
  });

  create() {
    const cars = this.createForm.value;
    this.carService.save(cars).subscribe(() => {
      alert("Create new Ok!");
    });
  }

  getAllCity() {
    this.start.getAll().subscribe(s => {
      this.from = s;
    })
  }
  getAllType() {
    this.type.getAll().subscribe(t => {
      this.types = t;
    })
  }

}
