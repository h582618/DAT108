package Oppgave3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Oppgave2.Ansatt;
import Oppgave2.Kjonn;

public class oppgave3 {

	public static void main(String[] args) {

		Ansatt a1 = new Ansatt("Geir", "Thomassen", "�konom", Kjonn.MALE, 300000);
		Ansatt a2 = new Ansatt("Thomas", "Geiresen", "Systemutvikler", Kjonn.MALE, 980000);
		Ansatt a3 = new Ansatt("Turild", "Potetesen", "Frontend Utvikler", Kjonn.MALE, 780000);
		Ansatt a4 = new Ansatt("Flat", "Womanesen", "Naver", Kjonn.FEMALE, 300000);
		Ansatt a5 = new Ansatt("Christan", "Evensen", "Sjef Zyzz", Kjonn.KENNETH, 700000);
		Ansatt a6 = new Ansatt("Simon", "Kobbernes", "Sjef Arnold", Kjonn.APACHEHELICOPTER, 800000);

		List<Ansatt> listen = Arrays.asList(a1, a2, a3, a4, a5, a6);

		// A
		List<String> listenString = listen.stream().map((a) -> a.getEtternavn()).collect(Collectors.toList());

		printAll(listenString);

		// B

		int womanCount = (int) listen.stream().filter((a) -> a.getKjonn().equals(Kjonn.FEMALE)).count();

		System.out.println(womanCount);

		// C

		int womanSalaryAVG = (int) listen.stream().filter((a) -> a.getKjonn().equals(Kjonn.FEMALE))
				.mapToInt((a) -> a.getAarslonn()).average().orElse(0);

		System.out.println(womanSalaryAVG);

		// D

		listen.stream().filter((a) -> a.getStilling().toUpperCase().contains("SJEF"))
				.forEach((a) -> a.setAarslonn(a.getAarslonn() + (a.getAarslonn() / 100) * 7));

		// E

		Boolean tjenerMerEnnaatteK = listen.stream().anyMatch((a) -> a.getAarslonn() > 800000);

		System.out.println(tjenerMerEnnaatteK);

		// F

		listen.stream().forEach(System.out::println);

		// G

		List<Ansatt> lavestLonn = listen.stream()
				.filter((a) -> listen.stream().min(Comparator.comparing(Ansatt::getAarslonn))
						.orElseThrow(NoSuchElementException::new).getAarslonn() == a.getAarslonn())
				.collect(Collectors.toList());

		System.out.println(lavestLonn);
		
		//H 
	
		 List<Integer> delig = IntStream.range(1, 1000)
				.filter(((a) -> a%3 == 0 || a%5 == 0))
				.boxed()
				.collect(Collectors.toList());
				
		 
		
		for(int ja : delig) {
			System.out.println(ja);
		}
		
		int delig2 = IntStream.range(1, 1000)
		.filter((a) -> a%3 == 0 || a%5 == 0)
		.sum();
		
		System.out.println(delig2);
		

	}

	static <T> void printAll(List<T> people) {
		for (T p : people) {
			System.out.println(p);
		}

	}

}
