package Paint;
import java.util.*;


public class Dreptunghi implements Shape{
	private int lungime;
	private int latime;
	private String fillColor ;
	private int border;
	private HexColorValidator validnr;
	private HexColorValidator validare;
	private static final String nume = "Dreptunghi";
	
	Dreptunghi(int l,int la,String s,int b){
		this.validnr = new HexColorValidator();
		this.validare=new HexColorValidator();
		this.lungime=l;
		this.latime=la;
		this.fillColor=s;
		this.border=b;
	}
	
	
	public void draw() {
		int rows = latime;
		int columns = lungime;
		String array[][]= new String[rows][columns];

		if(lungime==0 && latime==0) {
			System.out.println("Valoare 0");
		}else {
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
		boolean l =validnr.valDrep(latime);
		boolean L =validnr.valDrep(latime);
		if (l == true && L==true) {
			return lungime*latime;
		}
		return 0;
	}
	
	public String getName() {
		return nume;
	}
	
	public String getHexColor() {
		boolean ok=validare.valCuloare(fillColor);	
		if(ok==true)		
		  return  fillColor;	
		
		return "ERROR";
	}
	
	public void getBorderWidth() {
		System.out.println("Grosime chenar:");
		int rows = latime;
		int columns = lungime;
		String array[][]= new String[rows][columns];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = "#";
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				// condition for obtaining the boundary elements
				if(i==0 || j==0 || i == rows-1 || j == columns-1) 
					System.out.print(array[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
