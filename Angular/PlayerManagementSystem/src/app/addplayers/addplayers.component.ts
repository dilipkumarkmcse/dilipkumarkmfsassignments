import { Component } from '@angular/core';

@Component({
  selector: 'app-addplayers',
  templateUrl: './addplayers.component.html',
  styleUrl: './addplayers.component.css'
})
export class AddplayersComponent {
name: string = '';
loss: number | null = null;
wins: number | null = null;
gamesplayed: | null = null;
jerseynumber: | null = null;
club: string = '';
nationality: string = '';
age: | null = null;

displayn : string = '';
displaya : number | null = null;
displaycl : string = '';
displayna : string = '';
displayj : number | null = null;
displayg : number | null = null;
displayw : number | null = null;
displayl : number | null = null;
  
  display(){
    this.displayn = this.name;
    this.displaya = this.age;
    this.displaycl = this.club;
    this.displayna = this.nationality;
    this.displayj = this.jerseynumber;
    this.displayg = this.gamesplayed;
    this.displayw = this.wins;
    this.displayl = this.loss;
  } 
}
