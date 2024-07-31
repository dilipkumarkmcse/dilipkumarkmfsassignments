import { Component } from '@angular/core';

@Component({
  selector: 'app-addplayers',
  templateUrl: './addplayers.component.html',
  styleUrl: './addplayers.component.css'
})
export class AddplayersComponent {
  player = {
    number: null,
    name: '',
    club: ''
  };

  savedPlayer: any = null;

  onSubmit() {
    this.savedPlayer = { ...this.player };
  }

  onDelete() {
    this.savedPlayer = null;
    this.player = { number: null, name: '', club: '' };
  }

  onUpdate() {
    if (this.savedPlayer) {
      this.savedPlayer = { ...this.player };
    }
  }
}
