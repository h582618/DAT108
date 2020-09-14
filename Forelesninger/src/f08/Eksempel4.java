package f08;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Eksempel4 {

	public static void main(String[] args) {
	
		//Skrive ut alle partall i området [1,10>
		
		IntStream.range(0, 10)
		.filter(i -> i%2 == 0)
		.forEach(i -> System.out.print(i+ " "));
		
		System.out.println();
		
		//Skrive ut kvadratet av alle tallene i området[1,10> 

		IntStream.range(0, 10)
		.map(i -> i*i)
		.forEach(i -> System.out.print(i+ " "));
		
		//For en størmm på tallene 100,103,106,109
		//Skriv ut de 10 første som er delelig med 4
		
		System.out.println();
		
		Stream.iterate(100, x -> x+3)
		.filter(i -> i % 4 == 0)
		.limit(10)
		.forEach(i -> System.out.print(i+ " "));
		
		//For en stream av strenger, skriv edem sortet uten duplikater
		System.out.println();
		
		Stream.of("Per","Arne","Per","Knut","Lars","Thomas")
		.distinct()
		.sorted()
		.forEach(s -> System.out.print(s + " "));
		
	}

}
