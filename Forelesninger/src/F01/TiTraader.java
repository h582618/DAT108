package F01;

public class TiTraader {

	public static void main(String [] args) throws InterruptedException {
		
		String navn = Thread.currentThread().getName();
		System.out.println("Main tråden heter " + navn);
		
		MinTraad t1 = new MinTraad("Ding dong tråd");
		
		t1.start();
		
		Thread.sleep(5000);
		
		t1.stopp(); 
		/*
		for(int i = 1; i <= 10; i++) {
			Thread t = new Thread(new minRunnable(), "Tråd nr. " + i);
			t.start();
		}
		*/
	}
}
