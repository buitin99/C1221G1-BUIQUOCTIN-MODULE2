import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Car} from "../model/car";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Car[]> {
    return this.http.get<Car[]>(API_URL + '/carCustomer');
  }

  findById(id: number): Observable<Car> {
    return this.http.get<Car>(`${API_URL}/carCustomer/${id}`);
  }

  updateInfo(id: number, cars: Car): Observable<Car> {
    return this.http.put<Car>(`${API_URL}/carCustomer/${id}`, cars);
  }

  delete(id: number) {
    return this.http.delete<Car>(`${API_URL}/carCustomer/${id}`);
  }
}
