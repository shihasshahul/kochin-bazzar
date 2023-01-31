import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class KochinappService {

  usersDetails:any= []
  postsDetails:any= []
  adsDetails:any= []
  constructor(private http:HttpClient) { 
    
  }

  userdetails(){
      this.http.get(this.userUrl).subscribe(
        data=>
        this.usersDetails=data)   
  }
  postsdetails(){
    this.http.get(this.postUrl).subscribe(
      data=>
      this.postsDetails=data)   
}
adsdetails(){
  this.http.get(this.adUrl).subscribe(
    data=>
    this.adsDetails=data)   
}
  

  userUrl = "http://kochinuser-env.eba-r4yux4kr.ap-northeast-1.elasticbeanstalk.com/users/userdetails"
  postUrl = "http://postfavservices-env.eba-efjkm5dm.ap-northeast-1.elasticbeanstalk.com/"
  adUrl  =  "http://adsservices-env.eba-nm8eseuq.ap-northeast-1.elasticbeanstalk.com/"

  

}
