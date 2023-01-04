import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddpostComponent } from './addpost/addpost.component';
import { AdsComponent } from './ads/ads.component';
import { FavouritesComponent } from './favourites/favourites.component';
import { FeedsComponent } from './feeds/feeds.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'addpost', component: AddpostComponent },
  { path: 'ads', component: AdsComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component:RegisterComponent},
  { path: 'feeds', component:FeedsComponent},
  { path: 'favourites' , component:FavouritesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),],
  exports: [RouterModule]
})
export class AppRoutingModule { }
