package Uke34;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		Thread t = new Thread(new Runnable() {
			@Override 
			public void run() {
				System.out.println("Utskrift fra anonym runnable");
			}
		});

*/
		
		//lambda
		Thread t = new Thread(
				() -> System.out.println("Utskrift fra anonym runnable"));
		t.start();
		
		Thread.sleep(10);
		
		System.out.println();
	}

}
