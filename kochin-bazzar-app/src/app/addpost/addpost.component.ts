import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import AWSS3UploadAshClient from 'aws-s3-upload-ash';
import { UploadResponse } from 'aws-s3-upload-ash/dist/types';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-addpost',
  templateUrl: './addpost.component.html',
  styleUrls: ['./addpost.component.scss']
})
export class AddpostComponent implements OnInit {

  
  
  constructor(public http : HttpClient) { }

  ngOnInit(): void {
  }
  // upload image if file value changed
  imagefile: any=null;
  imgname:any;
  config = {
    bucketName: 'post-imageskochin',
    dirName: 'media', /* optional - when use: e.g BUCKET_ROOT/dirName/fileName.extesion */
    region: 'ap-northeast-1',
    accessKeyId:environment.AWS_ACCESS_KEY,
    secretAccessKey: environment.AWS_SECRET_KEY,
    s3Url: 'https://post-imageskochin.s3.ap-northeast-1.amazonaws.com/'
  }
  S3CustomClient: AWSS3UploadAshClient = new AWSS3UploadAshClient(this.config);

  selectimg(file:any){
    this.imagefile=file.target.files[0]
    console.log(this.imagefile)
    this.imgname=this.imagefile.name
    console.log(this.imgname)


  }
  async handleSendFile() {
    console.log(environment)
    console.log("File sent")
    await this.S3CustomClient
      .uploadFile(this.imagefile, this.imagefile.type, undefined, this.imagefile.name, "public")
      .then((data: UploadResponse) => console.log(data))
      .catch((err: any) => console.error(err) )}



  addpostForm = new FormGroup({
    title: new FormControl('',[Validators.required,Validators.minLength(10),Validators.maxLength(100)]),
    location: new FormControl('',[Validators.required,Validators.minLength(10),Validators.maxLength(100)]),
    price: new FormControl('',[Validators.required,Validators.minLength(10),Validators.maxLength(15)]),
    type: new FormControl('',[Validators.required]),
    email: new FormControl('',[Validators.email,Validators.required]),
    mobile: new FormControl('',[Validators.required,Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
    details: new FormControl('',[Validators.required]),
    image:new FormControl('',[Validators.required]),

  }); 

  
      send(){
        console.log(this.addpostForm.get("title")?.value+" " + 
        this.addpostForm.get("location")?.value+" " + 
        this.addpostForm.get("price")?.value+" " + 
        this.addpostForm.get("type")?.value+""+
        this.addpostForm.get("email")?.value+""+
        this.addpostForm.get("mobile")?.value+""+
        this.addpostForm.get("details")?.value
        )
    
        this.http.post("http://localhost:8084/post/postadd",{
              postName:this.addpostForm.get("title")?.value,
          postLocation:this.addpostForm.get("location")?.value,
          postPrice:this.addpostForm.get("price")?.value,
          postType:this.addpostForm.get("type")?.value,
          userEmail:this.addpostForm.get("email")?.value,
          userPhonenumber:this.addpostForm.get("mobile")?.value,
          postDetails:this.addpostForm.get("details")?.value,
          postImages:this.imgname
        }).subscribe()




        alert("sended")

      }
  
}
