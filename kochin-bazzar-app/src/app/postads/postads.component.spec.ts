import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostadsComponent } from './postads.component';

describe('PostadsComponent', () => {
  let component: PostadsComponent;
  let fixture: ComponentFixture<PostadsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostadsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostadsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
