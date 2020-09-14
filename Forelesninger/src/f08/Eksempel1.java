package f08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import no.hvl.dat108.f07.Person;

public class Eksempel1 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
/*
		for(Person p: people) {
			if(p.getFirstName().startsWith("C")) {
				System.out.println(p);
			}
		}
		*/
		
		people.stream()
		.filter((p) -> p.getFirstName().startsWith("C"))
		.forEach(System.out::println);
		
		//En liste av etternavnene til de som er over 50 år
		
		List<String> etternavnene = new ArrayList<>();
		for(Person p : people) {
			if(p.getAge() > 50) {
				etternavnene.add(p.getLastName());
			}
		}
		
		List<String> lastNames = people.stream() // From people
		.filter((p) -> p.getAge() > 50) // Where age > 50
		.map((p) -> p.getLastName()) //Person::getLastName Select lastname
		.collect(Collectors.toList()); 
		
		System.out.println(lastNames);
	}
	


}
