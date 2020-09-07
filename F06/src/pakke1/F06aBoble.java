package pakke1;

import java.util.Arrays;
import java.util.List;

public class F06aBoble{

	private static void sorter(List<Integer> listen) {

		for (int i = 0; i < listen.size(); i++) {

			for (int j = 1; j < listen.size(); j++) {
				if (listen.get(j - 1) > listen.get(j)) {
					int temp = listen.get(j - 1);
					listen.set(j - 1, listen.get(j));
					listen.set(j, temp);
				}
			}
		}
	}
	private static <T extends Comparable <T>> void sorter2(List<T> listen) {

		for (int i = 0; i < listen.size(); i++) {

			for (int j = 1; j < listen.size(); j++) {
				if (listen.get(j - 1).compareTo(listen.get(j)) > 0) {
					T temp = listen.get(j - 1);
					listen.set(j - 1, listen.get(j));
					listen.set(j, temp);
				}
			}
		}
	}
	private static <T extends Comparable <T>> void sorter3(
			List<T> listen, Sammenligner s) {

		for (int i = 0; i < listen.size(); i++) {

			for (int j = 1; j < listen.size(); j++) {
				if (s.sammenlign(listen.get(j - 1), (listen.get(j))) > 0) {
					T temp = listen.get(j - 1);
					listen.set(j - 1, listen.get(j));
					listen.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {

		List<Integer> listeAvTall = Arrays.asList(4, 2, 7, 5, 9, 1);

		sorter(listeAvTall);

		System.out.println(listeAvTall);

		List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
		sorter2(listeAvString);

		System.out.println(listeAvString);
		
		List<Person> listeAvPersoner = Arrays.asList(
				new Person("Anne", "Persen"),
				new Person("Per","Andersen"), 
				new Person("Knut","Svendsen"));
		sorter2(listeAvPersoner);
		System.out.println(listeAvPersoner);
		
		//Jeg ønsker å sortere personene på fornavn! Hva gjør vi
		
		Sammenligner<Person> s = new FornavnSammenligner();
		
		sorter3(listeAvPersoner,s);
		System.out.println(listeAvPersoner);
		
		//Sortere på fødselsår
		sorter3(listeAvPersoner, new Sammenligner<Person>() {

			@Override
			public int sammenlign(Person a, Person b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});

	}

}
