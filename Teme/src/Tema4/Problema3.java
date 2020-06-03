package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {

	boolean binarySearch(int vector[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (vector[mid] == x)
				return true;

			if (vector[mid] > x)
				return binarySearch(vector, l, mid - 1, x);

			return binarySearch(vector, mid + 1, r, x);
		}
		return false;
	}

	public static void main(String[] args) {
		Problema3 o = new Problema3();
		int vector[] = { 2, 3, 4, 10, 40, 66, 77 };
		int n = vector.length;

		Scanner input = new Scanner(System.in);
		System.out.print("De la tastatura sau automat? : ");
		String userinput = input.nextLine();

		if (userinput.equals("t")) {
			System.out.println("Sirul de caractere :\n" + Arrays.toString(vector));
			Scanner skar = new Scanner(System.in);
			System.out.print("Introduceti o valoare din vector :");
			int x = skar.nextInt();
			boolean result = o.binarySearch(vector, 0, n - 1, x);
			if (result == false)
				System.out.println("Elementul " + x + " nu se afla in sir => " + result);
			else
				System.out.println("Elementul " + x + " se afla in sir => " + result);
		} else if (userinput.equals("a")) {
			int x1 = 4;
			int x2 = 3;
			boolean result1 = o.binarySearch(vector, 0, n - 1, x1);
			boolean result2 = o.binarySearch(vector, 0, n - 1, x2);
			System.out.println("\n1)Jumatatea din stanga , pozitie (para) si impara: " + result1);
			System.out.println("2)Jumatatea din stanga , pozitie para si (impara): " + result2);

			int x3 = 77;
			int x4 = 40;
			boolean result3 = o.binarySearch(vector, 0, n - 1, x3);
			boolean result4 = o.binarySearch(vector, 0, n - 1, x4);
			System.out.println("\n3)Jumatatea din dreapta , pozitie (para) si impara: " + result3);
			System.out.println("4)Jumatatea din dreapta , pozitie para si (impara): " + result4);

			int x5 = 40;
			boolean result5 = o.binarySearch(vector, 0, n - 1, x5);
			System.out.println("\n5)Mijlocul siurlui: " + result5);

			int x6 = 2;
			boolean result6 = o.binarySearch(vector, 0, n - 1, x6);
			System.out.println("\n6)Primul numar din sir: " + result6);

			int x7 = 77;
			boolean result7 = o.binarySearch(vector, 0, n - 1, x7);
			System.out.println("\n7)Ultimul numar din sir: " + result7);

			int x8 = 1234;
			boolean result8 = o.binarySearch(vector, 0, n - 1, x8);
			System.out.println("\n8)Valoare invalida: " + result8);
		} else {
			System.out.print("...");
		}
	}

}
