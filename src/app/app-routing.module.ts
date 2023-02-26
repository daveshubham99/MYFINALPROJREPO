import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { AdminComponent } from './admin/admin.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { AddmedicineComponent } from './addmedicine/addmedicine.component';
import { CartComponent } from './cart/cart.component';
import { SearchComponent } from './search/search.component';


const routes: Routes = [
{
path:"",
component:HomeComponent},
{
path:"user",
  component:UserComponent
},
{
  path:"admin",
  component:AdminComponent

},
{
  path:"userRegistration",
  component:UserRegistrationComponent
},
{
  path:"login",
  component:UserComponent

},
{
  path:"addmedi",
  component:AddmedicineComponent
},
{
  path:"cart",
  component:CartComponent
},
{
  path:"search",
  component:SearchComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
