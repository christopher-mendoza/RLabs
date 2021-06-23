import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  interpolatedString: string = "Hi! I am an interpolated string. Defined in the DataBindingComponent.";
  interpolatedNumber: number = 1234;
  interpolatedBoolean: boolean = false;

  btnClass: string = 'btn btn-outline-primary';
  btnText: string = 'Submit';

  btnClassDisabled: string = 'btn btn-outline-danger disabled';
  btnTextDisabled: string = 'Disable';

  btnClassEnabled: string = 'btn btn-outline-success';
  btnTextEnabled: string = 'Enabled';

  isDisplayed: boolean = false;
  showButtonText: string = 'Show the image';

  imageUrl: string = 'http://lorempixel.com/400/200';

  constructor() { }

  ngOnInit(): void {
  }

  showPicture() {
    console.log('Show Image Button was pressed.');
    this.isDisplayed = !this.isDisplayed;
    if(this.isDisplayed) {
      this.showButtonText = 'Hide the image';
    }
    else {
      this.showButtonText = 'Show the image';
    }
  }

}
