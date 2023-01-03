import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddpostComponent } from './addpost/addpost.component';
import { FeedsComponent } from './feeds/feeds.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [

 {path:'addpost',component:AddpostComponent},
 {path:'',component:HomeComponent},

  { path: 'addpost', component: AddpostComponent },

  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component:RegisterComponent},
  { path: 'feeds', component:FeedsComponent}

  { path: '', component: HomeComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes),],
  exports: [RouterModule]
})
export class AppRoutingModule { }
