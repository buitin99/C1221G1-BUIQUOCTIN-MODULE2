import {City} from "./city";
import {Type} from "./type";

export interface Car {
  id: number;
  licensePlates: string;
  name: string;
  departure: City;
  destination: City;
  phone: string;
  email: string;
  startTime: string;
  endTime: string;
  type: Type;
}
