package Proiect;

import java.util.*;

public class HMvsLHM {

	public static void addSiPrint(AbstractMap<Integer, String> map) {
		int[] vector = { 1, -1, 0, 2 ,-2};
		for (int x : vector) {
			map.put(x, Integer.toString(x));
		}
		System.out.print("[");
		for (int k : map.keySet()) {
			System.out.print(k + " ");
		}
		System.out.print("]\n");
	}
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<Integer, String>(); 
		
		
		System.out.println();
		System.out.print("HashMap : ");
		addSiPrint(hMap);
		System.out.print("-> ordinea cheilor (Keys) este arbitrara");
		System.out.println();
		System.out.println();
		System.out.print("LinkedHashMap : ");
		addSiPrint(lhMap);
		System.out.print("-> ordinea cheilor (Keys) este ordonata in functie de modul de inserare");
		
		// Keys are ordered by their insertion order
		
	}

}
