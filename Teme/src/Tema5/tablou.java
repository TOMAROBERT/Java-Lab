package Tema5;

import java.util.*;

public class tablou {

	public static void randMat(int n, int m) {
		Random r = new Random();
		int[][] a = new int[n][m];
		for (int i =0 ; i<n ; i++) {
			for (int j =0 ; j<m ;j++) {
				a[i][j] = r.nextInt(200);
				System.out.print(a[i][j] + "\t");
			}

			System.out.print("\n");
		}
	

		int sum = 0;
		int indexCounter = 0; // Use this to keep track of the number of 'entries' in the arrays since they may not be perfectly rectangular.
		for(int column = 0; column < a.length; column++) {
		    for(int row = 0; row < a[column].length; row++) {
		        sum+= a[column][row];
		        indexCounter++;
		    }
		}
		int average = sum / indexCounter;
		System.out.println("Media este " + average);
	}

	
	public static void main(String[] args) {		
		randMat(4,1);
	
	}

}
