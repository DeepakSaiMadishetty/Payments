import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { Customer } from './Customer';
import { tap,catchError } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  url:string="http://localhost:8080/customer"
  constructor(private http:HttpClient) { }

  getCustomerById(id:string):Observable<Customer>{
    return this.http.get<Customer>(this.url + "/" + id.trim()).pipe(
      tap(item => console.log(item)),
      catchError(this.handleError)
    );
  }

  private handleError(error: any) {
    console.error("error status");
    return throwError('something bad happened. Please try again'+error);
}
  
  
}

