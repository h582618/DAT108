package f08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import no.hvl.dat108.f07.Person;

public class Comparing {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		Collections.sort(people, (a, b) -> a.getLastName().compareTo(b.getLastName()));

		System.out.println(people);

		Collections.sort(people, vedAaSammenligne(Person::getAge));

		Collections.sort(people, vedAaSammenligne(Person::getLastName));
		Collections.sort(people, vedAaSammenligne(p -> p.getLastName()));

	}

	static <T, U extends Comparable<U>> Comparator<T> 
	vedAaSammenligne(Function<T, U> henteEgenskap) {
		return (a, b) -> henteEgenskap.apply(a).compareTo(henteEgenskap.apply(b));
	}

}
