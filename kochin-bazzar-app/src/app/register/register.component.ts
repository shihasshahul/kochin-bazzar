import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  Userform = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    email: new FormControl(''),
    location: new FormControl(''),
    usertype: new FormControl({value:'User',disabled:true}),
    mobile: new FormControl(''),
    password: new FormControl(''),
    cpassword: new FormControl('')
    
  });

  Signup(){
    console.log(this.Userform.get('firstName')?.value)


    this.http.post("http://kochinuser-env.eba-r4yux4kr.ap-northeast-1.elasticbeanstalk.com/users/adduser",{
          userName:this.Userform.get("firstName")?.value,
          userLastname:this.Userform.get("lastName")?.value,
          userEmail:this.Userform.get("email")?.value,
          userPhonenumber:this.Userform.get("mobile")?.value,
          userLocation:this.Userform.get("location")?.value,
          userType:this.Userform.get("usertype")?.value,
          userPassword:this.Userform.get("password")?.value
        }).subscribe(data=>console.log(data))


  }

}
