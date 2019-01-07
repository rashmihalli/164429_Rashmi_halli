import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',          //Points to the HTML file
  styleUrls: ['./app.component.css']            //points to the css file
})

export class AppComponent {
  title = 'Hello World of TypeScript! ';
  firstname = "Rashmi";
  lastname = "Halli"

  location: address = {
    "street" : "shivayogi nagar, Ashram Road",
    "city" : "vijayapur"
  }
}

class address{
  street : string;
  city : string;
}