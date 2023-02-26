import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { product } from '../model/product';

@Component({
  selector: 'app-addmedicine',
  templateUrl: './addmedicine.component.html',
  styleUrls: ['./addmedicine.component.css']
})
export class AddmedicineComponent {

  CutomerArray : any[]  =[];
  isResultLoaded =false;
  isUpdateFormActive= false;
  productName : string="";
  productTags :String="";
  productCompany :String="";
  productPrice :String="";
  productid:number=0;
  searchtext:any;

 


constructor ( private httpclient:HttpClient )
{
this.getallproduct();
}
delete(product:product)

{
  this.httpclient.post("http://localhost:8081/api/v1/product/deletebyid",product,{responseType:'text'}).subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     alert("user deleted ")
    
  
     
  
  
  
  
  });
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
save()
{
  console.log(this.productid)
  if(this.productid==0)
  {
    this.register();
  }
  else{
    this.setupdate();
  }
}

register()
{


  let data =
  {
    
    "productName": this.productName,
    "productTags": this.productTags,
    "productCompany": this.productCompany,
    "productPrice": this.productPrice
  };
  this.httpclient.post("http://localhost:8081/api/v1/product/save",data,{responseType:'text'}).subscribe((resultdata:any)=>
{
    console.log("Medicine added succefully");
    alert("Medicine added succefully");
});
}
update(product:any)
{
  this.productid=product.productid;
  this.productName=product.productName;
  this.productTags=product.productTags;
  this.productCompany=product.productCompany;
  this.productPrice=product.productPrice;
}


setupdate()
{


  let data =
  {
    "productid":this.productid,
    "productName": this.productName,
    "productTags": this.productTags,
    "productCompany": this.productCompany,
    "productPrice": this.productPrice
  };
  this.httpclient.post("http://localhost:8081/api/v1/product/update",data,{responseType:'text'}).subscribe((resultdata:any)=>
{
    console.log("Medicine updated succefully");
    alert("Medicine updated succefully");
});
}  




}
