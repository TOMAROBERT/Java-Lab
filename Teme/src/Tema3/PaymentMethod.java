package Tema3;
import java.util.*;

public class PaymentMethod {
	String type ;

	public String getType() {
		return type;
	}
	
	public PaymentMethod(String t) {
		this.type = t ;
	}
	
	void getPaymentMethod() 
    { 
	   System.out.println();	
       System.out.println("Cash sau card ?:"+getType());
    }

	public static void main(String[] args) {		
		Adress ad = new Adress("Carpati","Codlea",16);
		ad.getFullAdress();
	
		Customer ct1 = new Customer("Toma" , "Robert" , 22);
		ct1.getCompleteName();
		
		Customer ct2 = new Customer("Jon" , "Jonulescu" , 22 , ad);
		ct2.getCustomer();
		
		ct2.getAdress().getFullAdress();
		
		PaymentMethod pm = new PaymentMethod("Card");
		pm.getPaymentMethod();
		
		Customer ct3 = new Customer("Ionel" , "Ion" , 22 , ad ,pm);
		ct3.getCustomerWithPayment();

	}

}
