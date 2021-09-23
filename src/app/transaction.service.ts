import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { Transaction } from './Transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  url:string="http://localhost:8080/transaction"
  constructor(public http:HttpClient) { }

  
  addTransaction(transaction:Transaction):Observable<number>{
    let httpHeaders = new HttpHeaders({
      'Content-Type':'application/json'
    });
    return this.http.post<Transaction>(this.url,JSON.stringify(transaction) , {
      headers: httpHeaders,
      observe: 'response'
    }).pipe(
      map(res=>res.status),
      catchError(this.handleError)
    );
  }

  



 private handleError(error: any) {
  console.error(error.messages);
  return throwError(error);
}
}
