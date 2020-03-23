package Tema3;
import java.util.*;

public class Adress {

	String street ;
	String city ;
	int number ;
	
	public Adress(String st , String ct , int nr) {
	    this.street = st;
	    this.city = ct ;
	    this.number = nr;
	  }
	
	public Adress() {
		
	}
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getNumber() {
		return number;
	}

    void getFullAdress() 
    { 
       System.out.println();	
       System.out.println("Strada:"+getStreet()+",Orasul :"+getCity()+",numarul: "+getNumber());
    } 
	

}
