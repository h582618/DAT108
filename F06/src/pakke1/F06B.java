package pakke1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class F06B {

	public static void main(String[] args) {
		
		List<String> listen = Arrays.asList("Hallo", "blabla"
				,"knut","Per");
		/*
		Collections.sort(listen, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.toUpperCase().compareTo(s2.toUpperCase());
			}
			
		});
		System.out.println(listen);
		*/
		
		//Bruke lambda utrykk til å representere en Comparator
		
		Collections.sort(listen,
				(s1, s2) -> s1.toUpperCase().compareTo
				(s2.toUpperCase()));
		
		//Sortere ved lengde på strengen
		Collections.sort(listen,
				(s1, s2) -> s1.length() - s2.length());
		
		System.out.println(listen);
		
		//Baklengs på String-lenge
		
		Comparator<String> baklengsPaaLengde
		= (a, b) -> b.length() - a.length();
		Collections.sort(listen,baklengsPaaLengde);
		System.out.println(listen);
		
	}
}
