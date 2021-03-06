package Oppgave2;

import java.util.Random;

public class Chef extends Thread {

	BurgerQueue burgerQueue;
	String name = "Kokk";

	public Chef(BurgerQueue burgerQueue, int i) {
		this.burgerQueue = burgerQueue;
		this.name = name + i;
	}

	// Make burger
	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(getRandom(2000, 6000));
				Burger newBurger = new Burger();
				burgerQueue.addBurger(newBurger, name);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

	public static int getRandom(int from, int to) {
		if (from < to)
			return from + new Random().nextInt(Math.abs(to - from));
		return from - new Random().nextInt(Math.abs(to - from));
	}
}
