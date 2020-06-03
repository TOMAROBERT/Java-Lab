package Proiect;
import java.util.*;

public class map {

	public static <String,Integer> String getKeyHM (Map<String,Integer> me , Integer value) {
		for (Map.Entry<String,Integer> map : me.entrySet()) {
        	if (value.equals(map.getValue())) {
        		return map.getKey();
        	}
		}
		return null;
	}
	
	public static <String,Integer> Integer getValueHM (Map<String,Integer> me , String key) {	
		for (Map.Entry<String,Integer> map : me.entrySet()) {
			if (key.equals(map.getKey())) {
				return map.getValue();
			}
		}
		return null;
	}
	
	public static <String,Integer> void show(Map<String,Integer> m) {
		Set<Map.Entry<String,Integer> > s = m.entrySet();
		for (Map.Entry<String,Integer> me:s) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       }
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Map <String,Integer> m2 = new HashMap <String,Integer>();
		Map <String,Integer> m = new HashMap <String,Integer>();	
		
		m.put("Codlea",505100);
		m.put("Rasnov",505400);
		m.put("Ghimbav",507075);
		m.put("Sacele",505600);
		m2.put("Dumbravita",507060);	
		System.out.println("Direct :" + m);    
		System.out.println("\nKey + value separate : ");
		show(m);
	            
	    System.out.println("\nMarime :" + m.size());
	    String searchKey = "Ghimbav";
	    System.out.println("Codul postal pentru " +  searchKey + " este " + getValueHM(m,searchKey) );

        int searchValue = 505100;
        System.out.println("Codul "+searchValue+" apartine orasului :" +getKeyHM(m, searchValue));
        
        m.putAll(m2);
        System.out.println("\nm+n :");
        show(m);
        
        m.remove("Codlea");
        show(m);
        
        
        
        
	
	}
}
