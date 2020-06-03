package Tema6;
import java.util.*;

public class main {

	public static <Integer,Student> void show(Map<Integer,Student> m) {
		Set<Map.Entry<Integer,Student> > s = m.entrySet();
		System.out.print("\n");
		for (Map.Entry<Integer,Student> me:s) 
	       { 
	           System.out.print("CNP-ul "+me.getKey()+" apartine studentului :"); 
	           System.out.println(me.getValue()); 
	       }
		System.out.println();
	}
	

	public static void main(String[] args) {
		Map<Integer,Student> map1 = new HashMap<Integer,Student>();
		Map<Integer,Student> map2 = new LinkedHashMap<Integer,Student>();
		Scanner skar = new Scanner(System.in);
		
		Student stud1 = new Student("Toma","Robert",Arrays.asList(7.8, 4.2 ,9.2),Arrays.asList(8.8, 3.2 ,9.8));
		Student stud2 = new Student("Bob","Peterson",Arrays.asList(4.8, 8.5 ,9.2),Arrays.asList(6.1, 6.2 ,9.9));
		Student stud3 = new Student("Mike","Wazowski",Arrays.asList(7.8, 4.2 ,9.2),Arrays.asList(8.8, 3.2 ,9.8));
		Student stud4 = new Student("Perry","Orni",Arrays.asList(7.5, 8.2 ,9.8),Arrays.asList(8.1, 6.2 ,6.8));
		Student stud5 = new Student("Nina","Williams",Arrays.asList(4.8, 5.2 ,7.2),Arrays.asList(8.9, 5.2 ,5.9));
		Student stud6 = new Student("Marshal","Law",Arrays.asList(3.8, 5.9 ,9.2),Arrays.asList(4.9, 7.2 ,8.9));
		Student stud7 = new Student("Test","Johhny",Arrays.asList(7.8, 8.9 ,6.2),Arrays.asList(7.9, 7.2 ,10.0));
	
		map1.put(1971121, stud1);
		map1.put(1971219, stud2);
		map1.put(1951010,stud3);	
		map1.put(1961220, stud4);
		map1.put(1950819, stud5);
		map1.put(1921021,stud6);
 	    show(map1);
		
		System.out.print("Introduceti CNP-ul :");
		int val = skar.nextInt();
		if(map1.get(val)==null)
		System.out.println("CNP invalid");
		else
			System.out.println("CNP-ul "+val+" apartine studentului "+map1.get(val));
		
		System.out.println("\nCNP-urile introduse sunt(HashMap):" +map1.keySet());
		skar.close();
		map2.put(1971121, stud1);
		map2.put(1971219, stud2);
		map2.put(1951010, stud3);	
		map2.put(1961220, stud4);
		map2.put(1950819, stud5);
		map2.put(1921021, stud6);
		map2.put(1971121, stud7);
		show(map2);
		int var = 1971121;
		System.out.println("\nCNP-urile introduse sunt(LinkedHashMap):" +map2.keySet());
		System.out.println("Studentul cu CNP-ul "+var +", are datele : "+map2.get(var));
		
		


	}

}
