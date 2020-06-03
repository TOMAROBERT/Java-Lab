package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema1b {

	public static void main(String[] args) {

		int[] vector = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };

		System.out.print("Introduceti index :");
		Scanner skam = new Scanner(System.in);
		int pozitie = isInRange(skam, skam.nextInt());
		System.out.println("Indexul este: " + pozitie);

		System.out.print("Introduceti o valoare :");
		int val = skam.nextInt();
		System.out.println("Valoarea este: " + val);
		skam.close();

		int pozitie2 = 0;
		int val2 = 666;

		System.out.println("Vectorul initial : " + Arrays.toString(vector));

		for (int i = vector.length - 1; i > pozitie; i--) {
			vector[i] = vector[i - 1];
		}
		vector[pozitie] = val;
		System.out.println("Vectorul , dupa modificare: " + Arrays.toString(vector));

	}

	public static int isInRange(Scanner scanner, int cifra) {
		if (cifra > 9 || cifra < 0) {
			System.out.print("Index gresit (0-9),introduceti alta cifra : ");
			cifra = scanner.nextInt();

		}
		return cifra;
	}

	
}
