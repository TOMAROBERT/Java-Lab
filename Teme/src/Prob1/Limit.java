package Prob1;

public class Limit {

	public static void main(String[] args) {
		System.out.println("Viteza maxima este:"+maxIF("Oras")+"km/h");
		System.out.println("Viteza maxima este:"+maxIF("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima este:"+maxIF("Drum express")+"km/h");
		System.out.println("Viteza maxima este:"+maxIF("Autostrada")+"km/h");
		System.out.println("Viteza maxima este:"+maxIF("???")+"km/h");
		
		System.out.println("----");
		
		System.out.println("Viteza maxima este:"+maxSW("Oras")+"km/h");
		System.out.println("Viteza maxima este:"+maxSW("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima este:"+maxSW("Drum express")+"km/h");
		System.out.println("Viteza maxima este:"+maxSW("Autostrada")+"km/h");
		System.out.println("Viteza maxima este:"+maxSW("???")+"km/h");


	}

	
	public static int maxIF(String drum) {
		if(drum=="Oras") {
			return 50;
		 }
		else {
			if(drum=="Zona rezidentiala") {
				return 30;
			}
			else {
				if(drum=="Drum express") {
					return 100;
				}
				else {
					if(drum=="Autostrada")
						return 130;
				}
			}
		}
		return 0;
	}
	
	public static int maxSW(String drum) {
		switch(drum) {
		  case "Oras":
		    return 50;		    
		  case "Zona rezidentiala":
		    return 30;		    
		  case "Drum express":
		    return 100;		    
		  case "Autostrada":
		    return 130;		     
		  default:
		    return 0;
		}
	}
			
	
}
