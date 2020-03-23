package Tema3;
import java.util.*;

public class Customer {
	String lastName ;
	String firstName ;
	int age ;
	private Adress adress ;
	private PaymentMethod type ;
	
	public Customer(String ln , String fn , int a ,Adress ad) {
		this.lastName = ln ;
		this.firstName = fn ; 
		this.age = a ;	
		this.adress = ad ;
		
	}
	
	public Customer(String ln , String fn , int a ,Adress ad,PaymentMethod t) {
		this.lastName = ln ;
		this.firstName = fn ; 
		this.age = a ;	
		this.adress = ad ;
		this.type = t ;
		
	}
	
	public Customer (String ln , String fn , int a) {
		this.lastName = ln ;
		this.firstName = fn ; 
		this.age = a ;	
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public Adress getAdress() {
		return adress;
	}
	
	
	
	
	void getCompleteName() 
    { 
	   System.out.println();	
       System.out.println("Numele:"+getLastName()+",prenumele:"+getFirstName() + ",varsta:"+getAge());
    }
	
	void getCustomer() {  
		System.out.println();
		System.out.println("Numele:"+lastName+",prenumele:"+firstName);  
		System.out.println("Domiciliul:"+adress.city+","+adress.street+","+adress.number);  
	}
	
	void getCustomerWithPayment() {  
		System.out.println();
		System.out.println("Numele:"+lastName+",prenumele:"+firstName);  
		System.out.println("Domiciliul:"+adress.city+","+adress.street+","+adress.number); 
		System.out.println("Cash sau card?:"+type.type); 
	}
	
	
	
}
