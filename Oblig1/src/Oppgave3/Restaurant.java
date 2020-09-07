package Oppgave3;

public class Restaurant {

	public static void main(String[] args) {

		BurgerQueue burgerQueue = new BurgerQueue();

		Chef chef = new Chef(burgerQueue, 1);
		Chef chef2 = new Chef(burgerQueue, 2);
		Chef chef3 = new Chef(burgerQueue, 3);

		Waitress waitress = new Waitress(burgerQueue, 1);
		Waitress waitress2 = new Waitress(burgerQueue, 2);

		chef.start();
		chef2.start();
		chef3.start();

		waitress.start();
		waitress2.start();
		

	}

}
