import { Component } from '@angular/core';
import { Players } from './model/Players';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-addplayers',
  templateUrl: './addplayers.component.html',
  styleUrls: ['./addplayers.component.css']
})
export class AddplayersComponent {  
  player : Players ;
  result : string
  playerArr : Players[];
  flag:boolean=false;

  constructor(private service : PlayerService){
    this.player = new Players();
    this.result = "";
    this.playerArr =[];
  }

 insert(data : any) {
  this.player.id = data.pId;
  this.player.pname = data.pname;
  this.player.page = data.page;
  this.player.pnationality = data.pnationality;
  this.player.pclub = data.pclub;
  this.player.pjerseyno = data.pjerseyno;
  this.player.pgamesplayed = data.pgamesplayed;
  this.player.pgoals = data.pgoals;
  this.player.pwins = data.pwins;
  this.player.ploss = data.ploss;
  this.result=this.service.insert(this.player);
 }
 update(data:any){
  this.player.id = data.pId;
  this.player.pname = data.pname;
  this.player.page = data.page;
  this.player.pnationality = data.pnationality;
  this.player.pclub = data.pclub;
  this.player.pjerseyno = data.pjerseyno;
  this.player.pgamesplayed = data.pgamesplayed;
  this.player.pgoals = data.pgoals;
  this.player.pwins = data.pwins;
  this.player.ploss = data.ploss;
  this.result=this.service.update(this.player);
 }
 deleteplayer(data:any){
  this.result=this.service.deleteplayer(data.pId);
 }
 find(data:any){
  this.player=this.service.find(data.pId);
  this.result=this.player.id+" "+this.player.pname+" "+this.player.page+" "+this.player.pnationality+" "+this.player.pclub+" "+this.player.pjerseyno+" "+this.player.pgamesplayed+" "+this.player.pgoals+" "+this.player.pwins+" "+this.player.ploss;
 }
 findAll() {
  this.playerArr=this.service.findAll();
  this.flag=true;
 }
}
