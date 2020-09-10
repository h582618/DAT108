package Oppgave2;

public class Ansatt
{

	String fornavn;
	String etternavn;
	String stilling;
	Kjonn kjonn;
	int aarslonn;
	public String getFornavn() {
		return fornavn;
	}
	public Ansatt(String fornavn, String etternavn, String stilling, Kjonn kjonn, int aarslonn) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.stilling = stilling;
		this.kjonn = kjonn;
		this.aarslonn = aarslonn;
	}
	@Override
	public String toString() {
		return "Ansatt [fornavn=" + fornavn + ", etternavn=" + etternavn + ", stilling=" + stilling + ", kjonn=" + kjonn
				+ ", aarslonn=" + aarslonn + "]";
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
	public String getStilling() {
		return stilling;
	}
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	public Kjonn getKjonn() {
		return kjonn;
	}
	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}
	public int getAarslonn() {
		return aarslonn;
	}
	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}
	
	
}
