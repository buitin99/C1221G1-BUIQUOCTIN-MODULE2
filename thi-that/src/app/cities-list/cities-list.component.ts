import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {CityService} from "../service/city.service";
import {City} from "../model/city";

@Component({
  selector: 'app-cities-list',
  templateUrl: './cities-list.component.html',
  styleUrls: ['./cities-list.component.css']
})
export class CitiesListComponent implements OnInit {

  cities: City[] = [];

  constructor(private http: HttpClient,
              private cityService: CityService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.cityService.getAll().subscribe(city => {
      this.cities = city;
    })
  }
}
