package Paint;

import java.util.*;

public class Patrat implements Shape {
	private int latura;
	private String fillColor;
	private HexColorValidator validare;
	private HexColorValidator validnr;
	private int border;
	private static final String nume = "Patrat";

	Patrat(int latura, String fillColor, int border) {
		this.validnr = new HexColorValidator();
		this.validare = new HexColorValidator();
		this.latura = latura;
		this.fillColor = fillColor;
		this.border = border;
	}

	Patrat(int latura) {
		super();
		this.latura = latura;
	}

	public void draw() {
		boolean br = false;
		int rows = latura;
		int columns = latura;
		String array[][] = new String[rows][columns];

		if (latura < 0) {
			System.out.println("Valoare 0");
		} else {
			for (int i = 0; i < rows; i++)
				for (int j = 0; j < columns; j++)
					array[i][j] = "#";

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(array[i][j]);
				}
				System.out.println();
			}
		}
	}

	
	public double getArea() {
	boolean l =validnr.valPat(latura);
		if (l == true) {
			return latura * latura;
		}
		return 0;
	}

	
	public String getName() {
		return nume;
	}

	public String getHexColor() {
		boolean culoare = validare.valCuloare(fillColor);
		if (culoare == true)
			return fillColor;

		return "ERROR";
	}

	public void getBorderWidth() {
		System.out.println("Grosime chenar:");
		int rows = latura;
		int columns = latura;
		String array[][] = new String[rows][columns];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = "#";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// condition for obtaining the boundary elements
				if (i == 0 || j == 0 || i == rows - 1 || j == columns - 1)
					System.out.print(array[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
