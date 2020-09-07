package pakke1;

public class Person implements Comparable<Person> {

	String fornavn;
	String etternavn;
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public Person(String fornavn, String etternavn) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}
	@Override
	public String toString() {
		return "[" + fornavn + " " + etternavn + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		return this.etternavn.compareTo(o.etternavn);
	}
	
	
}
