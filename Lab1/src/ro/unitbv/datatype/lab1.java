package ro.unitbv.datatype;

import java.util.*;

public class lab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Primul numar :");
		int nr1 = scanner.nextInt();
		System.out.println("Primul numar este :"+nr1);
		
		System.out.print("Al doilea numar :");
		int nr2 = scanner.nextInt();
		System.out.println("Al doilea numar este :"+nr2);
		
		int sum = nr1+nr2;
		System.out.println("Suma lor este:"+sum);
		
		int dif = nr1-nr2;
		System.out.println("Diferenta lor este:"+dif);
		
		int prod = nr1*nr2;
		System.out.println("Produsul lor este:"+prod);
		
		int media = (nr1*nr2)/2;
		System.out.println("Media lor este:"+media);
		
		int dist = Math.abs(nr1-nr2);
		System.out.println("Distanta lor este:"+dist);
		
		double rap = (double)nr1/nr2;
		System.out.print("Raportul lor este:");
		System.out.printf("%.3f%n", rap);
		
		System.out.println("Maximul este:"+Math.max(nr1, nr2));
		System.out.println("Minimul este:"+Math.min(nr1, nr2));
		
	}

}
