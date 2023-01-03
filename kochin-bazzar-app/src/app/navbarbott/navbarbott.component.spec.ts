import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarbottComponent } from './navbarbott.component';

describe('NavbarbottComponent', () => {
  let component: NavbarbottComponent;
  let fixture: ComponentFixture<NavbarbottComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NavbarbottComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NavbarbottComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
