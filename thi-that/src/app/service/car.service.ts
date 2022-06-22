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
    return this.http.get<Car[]>(API_URL + '/carCustomer/list');
  }


  findById(id: number): Observable<Car> {
    // return this.http.get<Car>(`${API_URL}/carCustomer/findById/${id}`);
    console.log(id);
    return this.http.get<Car>(`http://localhost:8080/carCustomer/findById/${id}`);

  }

  updateInfo(id: number, cars: Car): Observable<Car> {
    return this.http.patch<Car>(`http://localhost:8080/carCustomer/update/${id}`, cars);
  }

  delete(id: number) {
    return this.http.delete<Car>(`${API_URL}/carCustomer/delete/${id}`);
  }

  save(cars): Observable<Car> {
    return this.http.post<Car>(`${API_URL}/carCustomer/save/`, cars)
  }
}
