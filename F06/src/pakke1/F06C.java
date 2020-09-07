package pakke1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Betingelse {
	boolean erOppfylt(int x);
}

public class F06C {

	public static List<Integer> filter(List<Integer> listen, Betingelse b) {

		List<Integer> resultat = new ArrayList<>();
		for (int tall : listen) {
			if (b.erOppfylt(tall)) {
				resultat.add(tall);
			}
		}

		return resultat;
	}

	public static void main(String[] args) {

		List<Integer> listen = Arrays.asList(-4, 9, 2, 7, 6, 0);
		List<Integer> filtrertListe;

		// Alle partall
		filtrertListe = filter(listen, tall -> tall % 2 == 0);
		System.out.println(filtrertListe);

		// Alle tall større enn 0
		filtrertListe = filter(listen, tall -> tall > 0);
		System.out.println(filtrertListe);

		// Alle talle større enn 5
		filtrertListe = filter(listen, tall -> tall > 5);
		System.out.println(filtrertListe);

		// Alle talle større enn 7
		filtrertListe = filter(listen, storreEnn(7));
		System.out.println(filtrertListe);
	}

	public static Betingelse storreEnn(int grense) {
		return x -> x > grense;

	}
}
