import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  getAdd(a : number, b : number){
    return a + b;
  }
  getSub(a : number, b : number){
    return a - b;
  }
}
