import { TestBed } from '@angular/core/testing';

import { ExternalBankService } from './external-bank.service';

describe('ExternalBankService', () => {
  let service: ExternalBankService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExternalBankService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
