package Paint;

import java.*;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Consola {

	static int hexCnt(String vector[], int n, String x) {
		int y = 0;
		for (int i = 0; i < n; i++)
			if (x == vector[i])
				y++;
		return y;
	}

	public static void main(String[] args) {
		/*
		 * Patrat p = new Patrat(6, "#0019FA", 100); p.draw();
		 * System.out.println("Aria este :" + p.getArea());
		 * System.out.println("Numele este :" + p.getName());
		 * System.out.println("Culoarea  este :" + p.getHexColor()); p.getBorderWidth();
		 * 
		 * Dreptunghi d = new Dreptunghi(5,3,"#FAFA00",90); d.draw();
		 * System.out.println("Aria este :" + d.getArea());
		 * System.out.println("Numele este :" + d.getName());
		 * System.out.println("Culoarea  este :" + d.getHexColor()); d.getBorderWidth();
		 * 
		 * Cerc c= new Cerc(5,"#FF0000"); c.draw(); System.out.println("Aria este :" +
		 * c.getArea()); System.out.println("Numele este :" + c.getName());
		 * System.out.println("Culoarea  este :" + c.getHexColor()); c.getBorderWidth();
		 * System.out.println();
		 */
		int m = 0;
		List<Shape> forme = new ArrayList<>();
		forme.add(new Patrat(3, "#9E3535", 20));
		forme.add(new Dreptunghi(5, 4, "#F5F5F5", 10));
		forme.add(new Cerc(4, "#63660D"));
		forme.add(new Patrat(3, "#63660D", 20));
		forme.add(new Dreptunghi(5, 4, "#CCFFE5", 10));
		forme.add(new Cerc(4, "#F5F5F5"));
		

		for (Shape r : forme) {
			r.draw();
			System.out.print("CULOAREA este: ");
			System.out.println(r.getHexColor());
			System.out.print("NUMELE este: ");
			System.out.println(r.getName());
			System.out.print("ARIA este: ");
			System.out.println(r.getArea());
			r.getBorderWidth();
		}
		System.out.println("\nProblema 4 / tema 4: ");
		/*
		 * String culoriCnt[] = new String[forme.size()]; for(String key:culoriCnt) {
		 * System.out.println(key + ": " + Collections.frequency(forme, key)); }
		 */

		String culoriCnt[] = new String[forme.size()];
		for (Shape s : forme) {
			culoriCnt[m] = s.getHexColor();
			m++;
		}

		Arrays.sort(culoriCnt);
		int num;
		for (int i = 0; i < culoriCnt.length; i++) {
			if (culoriCnt[i] == culoriCnt[i + 1]) {
				i++;
			}
			num = hexCnt(culoriCnt, culoriCnt.length, culoriCnt[i]);
			System.out.println(culoriCnt[i] + ":" + num);
		}

		/*
		 * Dreptunghi d = new Dreptunghi(5,3,"#b50aba",90); d.draw(); d.getArea();
		 * d.getName(); d.getHexColor(); d.getBorderWidth();
		 */

		/*
		 * Cerc c= new Cerc(5,"#b50aba",10); c.draw(); c.getArea(); c.getName();
		 * c.getHexColor(); c.getBorderWidth();
		 */

	}

}
