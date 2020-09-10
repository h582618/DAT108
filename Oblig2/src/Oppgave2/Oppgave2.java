package Oppgave2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class Oppgave2 {

	public static void main(String[] args) {

		Ansatt a1 = new Ansatt("Geir","Thomassen","Økonom", Kjonn.MALE,300000);
		Ansatt a2 = new Ansatt("Thomas","Geiresen","Systemutvikler", Kjonn.MALE,780000);
		Ansatt a3 = new Ansatt("Atle","Potetesen","Frontend Utvikler", Kjonn.MALE,780000);
		Ansatt a4 = new Ansatt("Flat","Womanesen","Naver", Kjonn.FEMALE,300000);
		Ansatt a5 = new Ansatt("Christan","Evensen","Zyzz", Kjonn.MALE,700000);
		Ansatt a6 = new Ansatt("Simon","Kobbernes","Arnold", Kjonn.MALE,800000);
		
		List<Ansatt> listen = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		//i
		lonnsoppgjor(listen,(a) -> a.getAarslonn()+5000, (a) -> true);

		//ii
		lonnsoppgjor(listen,(a) -> a.getAarslonn()+(a.getAarslonn()/100)*15, (a) -> true);
		
		//iii
		lonnsoppgjor(listen,(a) -> a.getAarslonn()+5000, (a) -> a.getAarslonn()<500000);
		
		
		//iiii
		lonnsoppgjor(listen,(a) -> a.getAarslonn()+(a.getAarslonn()/100)*15, (a) -> a.getKjonn().equals(Kjonn.MALE));
		
		
		printAll(listen);
		
		
	}
	static void printAll(List<Ansatt> people) {
		for(Ansatt p : people) {
			System.out.println(p.toString());
		}
		
	}

	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> f, Predicate<Ansatt> p) {
		
		for (Ansatt a : ansatte) {
			
			if(p.test(a)) {
			a.setAarslonn(f.apply(a));
			}
		}
	}
}
