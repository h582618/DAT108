import javax.swing.*;

public class Oppgave1 {

	public static void main(String[] args) throws InterruptedException {
	
	
		Text t1 = new Text();
		
		helloWorld helloWorld1 = new helloWorld(t1);
		PrintThread thread2 = new PrintThread (t1);
			
		helloWorld1.start();
		thread2.start();
		
	}
	
}
	

