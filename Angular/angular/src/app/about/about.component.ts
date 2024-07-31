import { Component } from '@angular/core';
import { FinderService } from '../finder.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  mul : number;
  constructor(private fin:FinderService){
    this.mul = fin.getmul(7,3)
  }
}
