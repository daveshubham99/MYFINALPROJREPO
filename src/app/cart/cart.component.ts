import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { product } from '../model/product';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {
  CutomerArray : any[]  =[];
  isResultLoaded =false;
  isUpdateFormActive= false;
  productName : string="";
  productTags :String="";
  productCompany :String="";
  productPrice :number=0;
  productid:number=0;


  constructor ( private httpclient:HttpClient  )
  {
    this.getFromCart();
    this.totalprice()
  }
  getFromCart()
{
  this.httpclient.get("http://localhost:8081/api/v1/product/getallcart").subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
deletefromcart()
{
  
}
totalprice()
{
  this.httpclient.get("http://localhost:8081/api/v1/product/totalprice").subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     this.totalprice=resultdata;
     
     

  });
}


}
