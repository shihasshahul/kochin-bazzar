import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';

import { SidebarComponent } from './sidebar/sidebar.component';


import { AddpostComponent } from './addpost/addpost.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { NavbarbottComponent } from './navbarbott/navbarbott.component';
import { FeedsComponent } from './feeds/feeds.component';
import { PostadsComponent } from './postads/postads.component';
import { AdsComponent } from './ads/ads.component';
import { FavouritesComponent } from './favourites/favourites.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,

    FooterComponent,
    SidebarComponent,
    AddpostComponent,
    LoginComponent,
    RegisterComponent,
    NavbarbottComponent,
    FeedsComponent,
    PostadsComponent,
    AdsComponent,
    FavouritesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,ReactiveFormsModule,FormsModule,
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
