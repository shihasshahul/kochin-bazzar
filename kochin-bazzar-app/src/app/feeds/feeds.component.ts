import { Component, OnInit } from '@angular/core';
import { KochinappService } from '../kochinapp.service';

@Component({
  selector: 'app-feeds',
  templateUrl: './feeds.component.html',
  styleUrls: ['./feeds.component.scss']
})
export class FeedsComponent implements OnInit {

  constructor(private service:KochinappService) { }

  ngOnInit(): void {
  }
  

}
