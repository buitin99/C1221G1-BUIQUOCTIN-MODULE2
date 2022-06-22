import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {City} from "../model/city";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {Type} from "../model/type";

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class CityService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<City[]> {
    return this.http.get<City[]>(API_URL + 'city/list');
  }
}
