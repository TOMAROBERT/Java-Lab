package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

	public static int[] removeEL(int[] vector, int index) {

		if (vector == null || index < 0 || index >= vector.length) {
			return vector;
		}

		int[] vecNou = new int[vector.length - 1];
		for (int i = 0, k = 0; i < vector.length; i++) {
			if (i == index) {
				continue;
			}
			vecNou[k++] = vector[i];
		}
		return vecNou;
	}

	public static int isInRange(Scanner scanner, int cifra) {
		Scanner skar = new Scanner(System.in);
		if (cifra > 10 || cifra < 0) {
			System.out.print("Index gresit (0-10) , introduceti alt index :");
			cifra = isInRange(skar, skar.nextInt());

		}
		return cifra;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };
		System.out.println("Vectorul in faza initiala :\n" + Arrays.toString(arr));

		Scanner skar = new Scanner(System.in);
		System.out.print("Introduceti index pentru a sterge valoarea :");
		int pozitie = isInRange(skar, skar.nextInt());
		System.out.println("Indexul este: " + pozitie);
		arr = removeEL(arr, pozitie);
		System.out.println("Vectorul rezultat: " + Arrays.toString(arr));

	}

}
