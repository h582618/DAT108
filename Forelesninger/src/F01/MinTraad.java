package F01;

public class MinTraad extends Thread {

	private boolean fortsette = true;
	
	public MinTraad(String navn) {
		super(navn);
	}
	
	public void stopp() {
		fortsette = false;
	}
	
	@Override 
	public void run() {
		while(fortsette) {
			System.out.println(getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
