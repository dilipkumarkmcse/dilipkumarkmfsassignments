import { Injectable } from '@angular/core';
import { Players } from './addplayers/model/Players';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  url :string;
  playerArr : Players[];
  player : Players;
  constructor(private http: HttpClient) { 
    this.url = "http://localhost:3004/players";
    this.player = new Players();
    this.playerArr = [];
  }
  insert(player : Players){
    this.http.post<Players>(this.url,player).subscribe();
    return `Player ${player.pname} Details Added`
  }
  deleteplayer(pId:number){
    this.http.delete<Players>(this.url+"/"+pId).subscribe();
    return `Player with id ${pId} Details Deleted`
  }
  update(player:Players){
    this.http.put<Players>(this.url+"/"+player.id,player).subscribe();
    return `Player ${player.pname} Details Updated`;
  }
  find(pId:number){
    this.http.get<Players>(this.url+"/"+pId).subscribe(data=> this.player=data); 
    return this.player;
  }
  findAll(){
    this.http.get<Players[]>(this.url).subscribe(data=> this.playerArr=data); 
    return this.playerArr;
  }
}
