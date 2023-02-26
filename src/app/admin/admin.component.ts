import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
email:string="";
pass:String="";
constructor(private httpclient:HttpClient,private router:Router)
{

}

checkadminlogin()
{
let data ={
  "email": this.email,
  "password": this.pass
}
this.httpclient.post("http://localhost:8081/api/v1/customer/admincheck",data,{responseType:'text'}).subscribe((resultdata:any)=>
 {

    alert(resultdata)
      if(resultdata=="admin not exist")
      {
        alert("admin doesnt exist");
       ;
      }
      else{
      alert(resultdata);
      
      this.router.navigate(['/'])
      
      
      }

 });
  
}
}
