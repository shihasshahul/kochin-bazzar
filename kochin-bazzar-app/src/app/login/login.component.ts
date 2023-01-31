import { Component, OnInit } from '@angular/core';
import { KochinappService } from '../kochinapp.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private service:KochinappService) { 
    
    
   
  }

  ngOnInit(): void {
    this.service.userdetails()
   
    
  }

}
