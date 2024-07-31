import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FinderService {

  getmul(c : number, d : number){
    return c*d;
  }
}
