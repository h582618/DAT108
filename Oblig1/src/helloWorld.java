import javax.swing.*;


public class helloWorld extends Thread {

	boolean ferdig = false;

	public Text text;
	
	
	public helloWorld(Text text) {
		this.text = text;
	}
	
	@Override
	public  void run() {
		while(!text.getText().toUpperCase().equals("QUIT")) {
		 text.setText(JOptionPane.showInputDialog("Legg til beskjed"));
		}
		 
	}
	
	public  void stopp() {
		ferdig = true;
	}
	
}
