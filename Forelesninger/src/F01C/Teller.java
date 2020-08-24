package F01C;

public class Teller {
	private int verdi = 0;

	
	public synchronized void tellOpp() {
		verdi++;
	}
	
	public synchronized void tellNed() {
		verdi--;
	}
	
	public int getVerdi() {
		return verdi;
	}
}
