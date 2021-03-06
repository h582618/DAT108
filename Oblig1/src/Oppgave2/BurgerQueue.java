package Oppgave2;
import java.util.LinkedList;

public class BurgerQueue  {

	public static int maxBurgers = 5;
	LinkedList<Burger> burgerQueue = new LinkedList<Burger>();
	int burgerNumber = 0;
	
	public synchronized void addBurger(Burger burger, String name) throws InterruptedException {
		if(isFull()){
			System.out.println("###" + name +" vil legge på en hamburger, men rutsjebanen er full. Venter! ###");
			wait();
		}
			burgerNumber += 1;
			burger.setNumber(burgerNumber);
			burgerQueue.add(burger);
			System.out.println(name + " legger på hamburger ("+burger.getNumber()+") => " +  toString());
			if(!isFull()) {
				notify();
			}
			
		}

		public synchronized void takeBurger(String name) throws InterruptedException {
		
		
		if(isEmpty()) {
			System.out.println("###" + name +" vil ta en hamburger, men rutsjebanen er tom. Venter! ###");
			wait();
		}
	
		System.out.println(name+" tar av hamburger ("+burgerQueue.getFirst().getNumber()+") <= " + toString());
		burgerQueue.pop();
		if(!isEmpty()) {
		notify();
		}
		
	}
	public boolean isFull() {
		return burgerQueue.size() >= maxBurgers;
	}
	public boolean isEmpty() {
		return burgerQueue.isEmpty();
	}
	public String toString() {
		
		String burgerNumbers = "[";
		for(var burger : burgerQueue) {
			burgerNumbers += "(" + burger.getNumber() + ")";
		}
		burgerNumbers += "]";
		return burgerNumbers;
	}
	
}
