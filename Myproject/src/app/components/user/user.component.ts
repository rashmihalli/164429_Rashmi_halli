import { Component, OnInit } from '@angular/core';
import { DataService } from '../../services/data.service'

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  // name = 'Rashmi Halli';
  name : string; //even if we initialize it here, the this.name over rides this initialized value.
  age : number;
  email : string;
  address : Address;
  hobbies : string[];

  constructor(private dataService: DataService) {
    console.log('constructor ran...');
   }

  ngOnInit() {  //life cycle hook,it will run when the component is initialized
    console.log('ngOnInit ran...');
    this.name = 'Rashmi Halli';
    this.age = 23;
    this.email = 'rashmi@gmail.com';
    this.address = {
      street : 'Shivayogi nagar',
      city : 'Hiriyur',
      state : 'Karnataka'
    };
    this.hobbies = ['hobby1', 'hobby2', 'hobby3'];
  }

  onClick(){
    this.name = 'Rashmi Niranjan';
    this.hobbies.push('New Hobby');
  }

  addHobby(hobby){
    console.log(hobby);
    this.hobbies.unshift(hobby);        //It is similar to push, but it will add at the first instead of last 
    return false;
  }

  deleteHobby(hobby){
    for(let i=0; i<this.hobbies.length; i++){
      if(this.hobbies[i] == hobby){
        this.hobbies.splice(i, 1);
      }
    }
  }

}

interface Address {
  street : string
  city : string
  state :string
}

