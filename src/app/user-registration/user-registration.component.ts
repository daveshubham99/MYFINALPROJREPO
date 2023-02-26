import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent {
  isUpdateFormActive= false;

  name:string="";
  email:string="";
  password:string="";
  mobile:number=0;

  constructor ( private httpClient:HttpClient){
      

  }

  save()
  {
    let data =
    {
      "name" : this.name,
      "email" :this.email,
      "password":this.password,
      "mobile":this.mobile
    };

    this.httpClient.post("http://localhost:8081/api/v1/customer/save",data,{responseType:'text'}).subscribe((resultdata:any)=>
    {
      console.log(resultdata);
      alert("user register succesfully");  
    }
    
    );
  }





}
