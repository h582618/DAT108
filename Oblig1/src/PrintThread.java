public class PrintThread extends Thread {


	
	
	public Text text;
	
	boolean ferdig = false;
	
	public PrintThread(Text text) {
		this.text = text;
	}

	@Override
	public void run() {	
		while(text.getText().toUpperCase() != "QUIT") {
		System.out.println(text.getText());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

}
