import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { ExternalBankService } from '../external-bank.service';
import { TransactionService } from '../transaction.service';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {

  customerid:string="temp";
  //person: Customer;
  customerErrorCode:number=200;
  fees:number=0;
  totalbalance!:number;
  totalbalanceflag:boolean=false;
  messages:string[]=['HOLD','SDVA','REPA','PHOI','PHON','PHOB','INTC','CORT','CHQB'];
  customerNotFound:boolean = false;
  bicNotFound:boolean = false;
  errorCode: any;
  status: any;
  transferstatus: boolean = false;
  overdraft:boolean = false;
  overdraftcheck:boolean = false;


  constructor(private customerService:CustomerService,
    private bankService:ExternalBankService,
    private transactionService:TransactionService) {
    
   }

  ngOnInit(): void {
  }

  customerDetails($event:any,form:NgForm){
    console.log($event.target.value);
    //let person=Customer;
    this.customerService.getCustomerById($event.target.value).subscribe(
      data=>{
        // console.log("pp "+data.customer_name)
        form.controls['customer_name'].setValue(data.customer_name);
        form.controls['account_balance'].setValue(data.account_balance);
        form.controls['overdraft'].setValue(data.overdraft);

        // form.value.customer_name=data.customer_name;
        // form.value.account_balance=data.account_balance;

        if(data.overdraft=="Y"){
          this.overdraft=true;
        }
        else
        {
          this.overdraft=false;
        }
        this.overdraftcheck=true;
        this.totalbalance=data.account_balance;
        

      },
      err => {
        if(err.status==500){
          this.customerNotFound=true;
          form.controls['customer_name'].setValue(null);
          form.controls['account_balance'].setValue(null);
          this.overdraftcheck=false;
        }
      }
    );

    //console.log(this.person.customer_name) 

   }

   bankDetails($event:any,form:NgForm){

    this.bankService.getBankById($event.target.value).subscribe(
      data=>{
        form.controls['bank_name'].setValue(data.bank_name);
        
        },
        err => {
          if(err.status==500){
            this.bicNotFound=true;
          }
        }
    );
   }

   calculateFees($event:any,form:NgForm){

    this.fees=$event.target.value*0.25;
    if(this.overdraft==true){
      this.totalbalanceflag=true;
    }
    else if(this.overdraft==false&&this.totalbalance>$event.target.value){
    this.totalbalanceflag=true;
    }
    else if(this.overdraft==false&&this.totalbalance<$event.target.value){
    this.totalbalanceflag=false;
    }
   }

    onSubmit(transfer:NgForm){

      //console.log(JSON.stringify(transfer));
   
       this.transactionService.addTransaction(transfer.form.value)
               .subscribe(statusCode => {
                 //Expecting success code 201 from server
                 this.status = statusCode;
   
   
               },
                 errorCode => {this.status = errorCode;
   
                 }
               );
               this.transferstatus=true;
       console.log(JSON.stringify(transfer.form.value));
       this.overdraftcheck=false;
       transfer.resetForm();
   }
   


}