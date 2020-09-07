package pakke1;

public class FornavnSammenligner implements Sammenligner<Person> {

	@Override
	public int sammenlign(Person a, Person b) {
		return a.getFornavn().compareTo(b.getFornavn());
	}

}
