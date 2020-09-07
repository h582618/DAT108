package Uke35;

import javax.swing.JOptionPane;

public class Mottaker extends Thread{

	private Melding melding;
	
	public Mottaker(Melding melding) {
		this.melding = melding;
	}
	
	@Override
	public void run() {
	
		while(true) {
			
		
		String nyMelding = JOptionPane.showInputDialog("Skriv inn melding:");
		
		synchronized(melding) {
			while(melding.erMotatt()) {
				try {
					melding.wait();
				} catch (InterruptedException e) {
					
				}
			}
			
			
		String mottatMelding = melding.getInnhold();
		melding.notifyAll();
		System.out.println("Mottaker har motatt melding");
		}
		}
		
		
	}
}
