import { Component, OnInit } from '@angular/core';
import {Car} from "../../model/car";
import {CarService} from "../../service/car.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  p: string | number;
  car: Car[] = [];
  constructor(private carService: CarService,
              private router: Router) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.carService.getAll().subscribe(cars => {
      this.car = cars;
    });
  }

  id: number;
  nameToDelete: number;

  deleteModal() {
    this.carService.delete(this.id).subscribe(() => {
      this.router.navigateByUrl('/list');
    }, error => {
      console.log(error);
    });
    this.ngOnInit();
    this.getAll();
  }

  showMessage(id: number, number: number) {
      this.id = id;
      this.nameToDelete = number;
  }
}
