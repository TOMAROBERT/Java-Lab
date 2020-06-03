package Tema4;
import java.util.Arrays;
import java.util.Scanner;

public class Problema1a {

	public static int[] addNr(int n, int vector[], int x, int poz) {

		int vecNou[] = new int[n + 1];
		for (int i = 0; i < n+1 ; i++) {
			if (i < poz-1 )
				vecNou[i] = vector[i];
			else if (i == poz)
				vecNou[i] = x;
			else
				vecNou[i] = vector[i-1];
		}
		return vecNou;
	}
	
	public static int isInRange(Scanner scanner, int cifra) {
		Scanner skar = new Scanner(System.in);
		if (cifra == 0) {
			System.out.print("Index gresit (0-10) , introduceti alt index :");
			cifra = isInRange(skar, skar.nextInt());
			
		}
		return cifra;
	}

	public static void main(String[] args) {
		int n = 10;
		int vec[] = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
		System.out.println("Vectorul in faza initiala :\n" + Arrays.toString(vec));

		Scanner skar = new Scanner(System.in);
		System.out.print("Introduceti o valoare :");
		int val = skar.nextInt();
		System.out.println("Valoarea este: " + val);


		System.out.print("Introduceti index :");
		int pozitie = isInRange(skar, skar.nextInt());
		System.out.println("Indexul este: " + pozitie);


		vec = addNr(n,vec, val, pozitie);
		System.out.println("\nValoarea " +val + " ,a fost introdusa la indexul " + pozitie + ":\n" + Arrays.toString(vec));

	}

}
