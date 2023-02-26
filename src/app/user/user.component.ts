import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import {  product } from '../model/product';
import { ActivatedRoute, Router } from '@angular/router';
import { query } from '@angular/animations';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  isUpdateFormActive= false;
email:string="";
password:string="";



constructor( private httpclient:HttpClient, private route:ActivatedRoute,private router:Router) {
  
}

login()
{
 
  let data =
  {
    "email": this.email,
    "password": this.password
  };
 this.httpclient.post("http://localhost:8081/api/v1/customer/login",data,{responseType:'text'}).subscribe((resultdata:any)=>
 {

    alert(resultdata)
      if(resultdata=="User not exist")
      {
        alert("user doesnt exist");
       ;
      }
      else{
      alert(resultdata);
      
      this.router.navigate(['/'])
      
      
      }

 }
 );
}

}