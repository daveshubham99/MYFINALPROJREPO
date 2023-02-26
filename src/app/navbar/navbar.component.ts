import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { product } from '../model/product';
import {CommonModule} from '@angular/common'; 
import { BrowserModule } from '@angular/platform-browser'; 



@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{
  login:boolean=false;
  adminlogin:boolean=false;
 constructor(private httpclient:HttpClient)
 {
this.login1();
this.isadminlogin();
 
 } ngOnInit(): void {
          // this.login=true;
          

 }
 login1()
          {
           
            
this.httpclient.get("http://localhost:8081/api/v1/customer/islogin").subscribe((resultdata:any)=>
           {

              this.login=resultdata;
              


           });

}
logout()
{
  this.httpclient.get("http://localhost:8081/api/v1/customer/logout").subscribe((resultdata:any)=>
           {

              this.login=resultdata;


           });
}
isadminlogin()
{
  this.httpclient.get("http://localhost:8081/api/v1/customer/isadminlogin").subscribe((resultdata:any)=>
           {

              this.adminlogin=resultdata;


           });
}
adminlogout()
{
  this.httpclient.get("http://localhost:8081/api/v1/customer/isadminlogout").subscribe((resultdata:any)=>
           {

              this.adminlogin=resultdata;
              alert("admin logged out");


           });
}
search()
{
   
}


}


