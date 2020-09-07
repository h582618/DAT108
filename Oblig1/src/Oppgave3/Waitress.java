package Oppgave3;

public class Waitress extends Thread {

	Burger currentBurger;
	BurgerQueue burgerQueue;
	String name = "Servitør";

	public Waitress(BurgerQueue burgerQueue, int i) {
		this.burgerQueue = burgerQueue;
		this.name = name + i;
	}

	// Fjern burger
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(Chef.getRandom(2000, 6000));
				burgerQueue.takeBurger(name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
