import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import AWSS3UploadAshClient from 'aws-s3-upload-ash';
import { UploadResponse } from 'aws-s3-upload-ash/dist/types';


@Component({
  selector: 'app-addpost',
  templateUrl: './addpost.component.html',
  styleUrls: ['./addpost.component.scss']
})
export class AddpostComponent implements OnInit {

  
  
  constructor() { }

  ngOnInit(): void {
  }
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

  // upload image if file value changed
  imagefile: any;
  imgname:any;

  config = {
    bucketName: 'post-imageskochin',
    dirName: 'media', /* optional - when use: e.g BUCKET_ROOT/dirName/fileName.extesion */
    region: 'ap-northeast-1',
    accessKeyId:"AKIA3EOB7Q47HCSMYEW2",
    secretAccessKey:"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" ,
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

    console.log("handleSendFile")
    await this.S3CustomClient.uploadFile(this.imagefile, this.imagefile.type, undefined, this.imagefile.name, "private")
      .then((data: UploadResponse) => {console.log(data)
      console.log("uploading")})
      .catch((err: any) => console.error(err))}
  
}
