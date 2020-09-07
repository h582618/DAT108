package Uke35;

import javax.swing.JOptionPane;

public class Sender extends Thread{

	private Melding melding;
	
	public Sender(Melding melding) {
		this.melding = melding;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			String nyMelding = JOptionPane.showInputDialog("Skriv inn melding:");
			
			synchronized(melding) {
				while(!melding.erMotatt()){
					
				}
			}
		}
		
	}
}
