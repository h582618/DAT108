package F01C;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
	

		Teller teller = new Teller();

		Thread telleOppTraad = new TelleoppTraad(teller, 1000);
		
		Thread telleNedTraad = new TelleNedTraad(teller, 1000);
		
		telleOppTraad.start();
		telleNedTraad.start();
		
		telleOppTraad.join();
		
		telleNedTraad.join();
		
		System.out.println(teller.getVerdi());
	}
}
