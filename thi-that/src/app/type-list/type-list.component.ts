import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {TypeService} from "../service/type.service";
import {Type} from "../model/type";

@Component({
  selector: 'app-type-list',
  templateUrl: './type-list.component.html',
  styleUrls: ['./type-list.component.css']
})
export class TypeListComponent implements OnInit {
  types: Type[] = [];
  constructor(private http: HttpClient,
              private typeService: TypeService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.typeService.getAll().subscribe(type => {
      this.types = type;
    })
  }
}
