import { TestBed } from '@angular/core/testing';

import { KochinappService } from './kochinapp.service';

describe('KochinappService', () => {
  let service: KochinappService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(KochinappService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
