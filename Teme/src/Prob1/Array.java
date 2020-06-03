package Prob1;

import java.util.*;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		double[] arr = {37.1,37.0,37.4,36.9};
		
        ArrayList<Double> no = new ArrayList<Double>();
        ArrayList<Double> ano = new ArrayList<Double>();
		System.out.println("Temperaturile pacientilor : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>37.0) {
				ano.add(arr[i]);
				System.out.println("Pacientul cu nr: "+(i+1)+" neste nesanatos si are temperatura: "+arr[i]);
			}else {
				no.add(arr[i]);
				System.out.println("Pacientul cu nr: "+(i+1)+" este sanatos si are temperatura: "+arr[i]);
			}
	
		}
		System.out.println("Sanatosi avem : " +no);
		System.out.println("Nesanatosi avem : "+ano);
		
        }
	}


