import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { product } from '../model/product';
import { Ng2SearchPipeModule } from 'ng2-search-filter';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent   {

  searchtext:any;
  CutomerArray : any[]  =[];
  isResultLoaded =false;
  isUpdateFormActive= false;
  productName : string="";
  productTags :String="";
  productCompany :String="";
  productPrice :String="";
  productid:number=0;


  constructor ( private httpclient:HttpClient  )
  {
    this.getallproduct();
  }
  

  getallproduct()
{
  
  this.httpclient.get("http://localhost:8081/api/v1/product/getallproducts").subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;
  
     
  
  
  
  
  });


}
addtocart(product:product)
{
  this.httpclient.post("http://localhost:8081/api/v1/product/savecart",product).subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;
  
     
  
  
  
  
  });
  


}
}
