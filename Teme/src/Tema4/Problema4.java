package Tema4;

import java.util.*;




public class Problema4 {
	
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("#000000");
		list.add("#000000");
		list.add("#b50aba");
		list.add("#b50aba");
		list.add("#b50YEEEa");
		list.add("#b50YEEEa");
		list.add("#b50fff");
		
		Set<String> unique = new HashSet<String>(list);
		for (String key : unique) {
			System.out.println(key + ": " + Collections.frequency(list, key));
		}

	}

}
