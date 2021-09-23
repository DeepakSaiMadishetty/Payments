import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { ExternalBank } from './ExternalBank';

@Injectable({
  providedIn: 'root'
})
export class ExternalBankService {

  url:string="http://localhost:8080/bank"
  constructor(public http:HttpClient) { }

  getBankById(id:string):Observable<ExternalBank>{
    return this.http.get<ExternalBank>(this.url + "/" + id.trim()).pipe(
      tap(item => console.log(item)),
      catchError(this.handleError)
    );
  }

  private handleError(error: any) {
    console.error("error status"+error.status);
    return throwError('something bad happened. Please try again'+error);
}
}
