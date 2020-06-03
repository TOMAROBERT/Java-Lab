package Paint;

import java.*;

public class Cerc implements Shape {
	private int raza;
	private String fillColor;
	private int border;
	private HexColorValidator validare;
	private HexColorValidator numar;
	private HexColorValidator validnr;
	private static final String nume = "Cerc";

	Cerc(int r, String f) {
		this.validnr = new HexColorValidator();
		this.validare = new HexColorValidator();
		this.numar = new HexColorValidator();
		this.raza = r;
		this.fillColor = f;
	}

	Cerc(int r) {
		this.raza = r;
	}

	public void draw() {
		double dist;
		int radius = raza;
		for (int i = 0; i <= 2 * radius; i++) {
			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

				if (dist > radius - 0.5 && dist < radius + 0.5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

	public double getArea() {
		boolean l = validnr.valCerc(raza);
		if (l == true) {
			return Math.PI * raza * raza;
		}
		return 0;
	}

	public String getName() {
		return nume;
	}

	public String getHexColor() {
		boolean ok = validare.valCuloare(fillColor);
		if (ok == true)
			return fillColor;

		return "ERROR";
	}

	public void getBorderWidth() {
		System.out.println("Diametrul cercului este:" + (2 * raza));

	}
}
