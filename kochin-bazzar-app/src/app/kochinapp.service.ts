import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class KochinappService {

  usersdetails:any= []
  constructor(private http:HttpClient) { 
    
  }

  userdetails(){
      this.http.get("http://kochinuser-env.eba-r4yux4kr.ap-northeast-1.elasticbeanstalk.com/users/userdetails").subscribe(data=>
        console.log(this.usersdetails=data)
      )
   
  }

  userUrl = "http://kochinuser-env.eba-r4yux4kr.ap-northeast-1.elasticbeanstalk.com/users/userdetails"
  postUrl = "http://postfavservices-env.eba-efjkm5dm.ap-northeast-1.elasticbeanstalk.com/"
  adUrl  =  "http://adsservices-env.eba-nm8eseuq.ap-northeast-1.elasticbeanstalk.com/"

  

}
