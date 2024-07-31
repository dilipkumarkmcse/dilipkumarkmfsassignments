import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  sum : number
  diff : number
  constructor(private cal : CalculatorService){
    this.sum = cal.getAdd(3,4);
    this.diff = cal.getSub(10,3)
  }
}
