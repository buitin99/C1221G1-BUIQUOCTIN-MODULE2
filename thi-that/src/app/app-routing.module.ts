import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {ListComponent} from "./car-manager/list/list.component";
import {CreateComponent} from "./car-manager/create/create.component";
import {UpdateComponent} from "./car-manager/update/update.component";


const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'home-page'},
  {path: 'home-page', component: HomeComponent},
  {path: 'list', component: ListComponent},
  {path: 'create', component: CreateComponent},
  {path: 'update/:id', component: UpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
