export class Customer{

    public customer_id:string;
        public customer_name:string;
        public account_balance:number;
        public overdraft:string;

    constructor(customer_id:string, customer_name:string, account_balance:number, overdraft:string){
            this.customer_id=customer_id;
            this.customer_name=customer_name
            this.account_balance=account_balance;
            this.overdraft=overdraft;
        }
}