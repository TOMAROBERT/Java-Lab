package Tema5;

import java.util.*;

public class test2 {

	public static void medie(int[][] array) {

		int sum = 0;
		int indexCounter = 0;
		for (int column = 0; column < array.length; column++) {
			for (int row = 0; row < array[column].length; row++) {
				sum += array[column][row];
				indexCounter++;
			}
		}
		double average = (double) sum / indexCounter;
		double dap = Math.round(average * 100.0) / 100.0;
		System.out.println("Media este " + dap);
	//	System.out.println("Suma este " + sum);
	}

	public static int range(Scanner scanner, int n) {
		Scanner skar = new Scanner(System.in);
		if (n == 3 || n == 2 || n == 1) {
			System.out.print("Forma " + n + "x" + n + " nu poate fi divizata,introduceti alta valoare :");
			n = range(skar, skar.nextInt());
		} else if (n == 0) {
			System.out.print("Matrice nula,introduceti alta valoare :");
			n = range(skar, skar.nextInt());
		} else if (n < 0) {
			System.out.print("Matrice negativa,introduceti alta valoare :");
			n = range(skar, skar.nextInt());
		}

		return n;
	}

	public static void splitNxN(int mainArray[][], int subArray[][], int n) {
		System.out.println("\nMatricele " + n + "x" + n + "\n");
		for (int row = 0; row < (mainArray.length); row += n) {
			for (int column = 0; column < mainArray[0].length; column += n) {
				for (int k = 0; k < n; k++) {
					for (int l = 0; l < n; l++) {
						subArray[k][l] = mainArray[row + k][column + l];
						System.out.print(subArray[k][l] + "\t");

					}
					System.out.println();
				}
				medie(subArray);
				System.out.println();
			}
		}
	}

	public static void show(int[][] mainArray) {
		Random r = new Random();
		int value;
		for (int i = 0; i < mainArray.length; i++) {
			for (int j = 0; j < mainArray[0].length; j++) {
				value = r.nextInt(255);
				mainArray[i][j] = value;
				System.out.print(mainArray[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void decizie(int m, int mainArray[][], int subArray[][]) {
		if (m % 2 == 0)
			splitNxN(mainArray, subArray, 2);
		else if (m % 3 == 0)
			splitNxN(mainArray, subArray, 3);
		else {
			int i = 2;
			i = m / 2;
			if (!(m % i == 0))
				System.out.println("Este numar prim , divizare inegala ");
		}
	}

	
	public static void main(String[] args) {
		Scanner skar = new Scanner(System.in);
//		Random r = new Random();
//		int n = 2;
//		int m = 4;
		System.out.print("Introduceti numarul de linii/coloane : ");
		int m = range(skar, skar.nextInt());
		System.out.println("\nNumarul de linii/coloane  este :" + m);
		int[][] mainArray = new int[m][m];	
		if (m % 2 == 0) {
			int subArray[][] = new int[2][2];
			show(mainArray);
			decizie(m, mainArray, subArray);
		} else {
			int subArray[][] = new int[3][3];
			show(mainArray);
			decizie(m, mainArray, subArray);
		}


	}

}
