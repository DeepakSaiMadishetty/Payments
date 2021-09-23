export class Transaction{

    public transaction_type!:string ;
    public message_code!:string ;
    public customer_id!:string ;
    public receiver_name!:string ;
    public receiver_id!:string ;
    public transaction_amount!:number ;
    public receiver_bic!:string;
  
    constructor(
      transaction_type:string,
      message_code:string,
      customer_id:string,
      receiver_id:string,
      receiver_name:string,
      transaction_amount:number,
      receiver_bic:string) {

        this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
		this.customer_id = customer_id;
		this.receiver_id = receiver_id;
		this.receiver_name = receiver_name;
		this.receiver_bic = receiver_bic;
		this.message_code = message_code;
    }
  }
  