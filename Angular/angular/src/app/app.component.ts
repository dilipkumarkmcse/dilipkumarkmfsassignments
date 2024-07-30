import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name :String;
  age : Number;
  email : string;
  imagepath: String;
  fname : string;
  flag : boolean;
  players : string[];
  selectedplayer : string
  mystyle : {};
  myclass : string;
  constructor(){
    this.name = "DK";
    this.age = 20;
    this.email = "dilip72765@gmail.com"
    this.imagepath = 'https://www.teachpeak.in/s/store/courses/65b09ffce4b015c21896589c/cover.jpg?v=1'
    this.fname="";
      this.flag=true;
      this.players = ["CR7","LM10","NJ11"]
      this.selectedplayer = "";
      this.mystyle = {'width' : '50%', 'border' : '2px solid black', 'border-radius' : '20px'}
      this.myclass = "one"
  }
  changeN(){
    this.name = "ronaldo";
  }
  changeA(){
    this.age = 39;
  }
  changeE(){
    this.email = "ronaldo7@gmail.com";
  }
  changeI(){
    this.imagepath = 'https://yt3.googleusercontent.com/y4J_Fs5ksRlxx6_LzT1VKxVqH_T8Vyn_RN_YYgLJhuMzBS5qxTgm7NlEcMkQd3hgCpfWtYcEUg=s900-c-k-c0x00ffffff-no-rj'
  }
  changeflag(){
    this.flag = !this.flag;
  }
  show(p : string){
    this.selectedplayer = p;
  }
  changestyle(){
    this.mystyle = {'width' : '60%', 'border' : '2px solid slateblue'}
  }
  changeclass(){
    this.myclass = "two"
  }
}

