package F01C;

public class TelleoppTraad extends Thread {

	private Teller teller;
	private int antallGanger;

	public TelleoppTraad(Teller teller, int i) {
		this.teller = teller;
		this.antallGanger = i;
	}

	@Override 
	public void run() {
		for(int i=0; i < antallGanger; i++) {
			
			teller.tellOpp();
		}
	}
}
