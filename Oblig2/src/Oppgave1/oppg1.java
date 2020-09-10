package Oppgave1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class oppg1 {

	static void printAll(List<String> streng) {
		for(String p : streng) {
			System.out.println(p);
		}
	}
	
	public static void main(String[] args) {
	
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		
		//Oppgave1a
		Collections.sort(listen,(a,b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));
		
        
		printAll(listen);
		
		//oppgave1b
		
		System.out.println("\noppgave1b");
		
	

		System.out.println(beregn(12,13,(x1, x2) -> x1 + x2));
		
		System.out.println(beregn(-5,3,(x1, x2) -> Math.max(x1, x2)));
		
		System.out.println(beregn(54,45,(x1, x2) -> Math.abs(x2-x1)));
		
	}
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> p) {
		
		return p.apply(a,b);
		
	}

}
