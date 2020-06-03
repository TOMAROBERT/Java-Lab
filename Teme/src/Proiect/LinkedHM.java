package Proiect;

import java.util.*;

public class LinkedHM {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "www.google.com");
		map.put(2, "www.yahoo.com");
		map.put(3, "www.bing.com");

		System.out.println(map);
		// key , value
		
		System.out.println("Site-ul corespunzator key-ului 2 este :" + map.get(2));
		System.out.println("Contine : " + map.size() + " elemente");
		System.out.println("Mapa goala ?:  " + map.isEmpty());
		System.out.println("Contine cheia cu nr. 6? :" + map.containsKey(3));
		System.out.println("Contine valoarea 'www.google.com'? :" + map.containsValue("www.google.com"));
		System.out.println("Stergem elementul 3: " + map.remove(3));
		System.out.println(map);
	}

}

