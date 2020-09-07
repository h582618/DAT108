package Oppgave3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BurgerQueue  {

	public static int maxBurgers = 5;
	public BlockingQueue<Burger> burgerBlock = new LinkedBlockingQueue<>(5);
	int burgerNumber = 0;
	
	public  void addBurger(Burger burger, String name) throws InterruptedException {
		if(isFull()){
			System.out.println("###" + name +" vil legge på en hamburger, men rutsjebanen er full. Venter! ###");
		} else {
			burgerNumber += 1;
			burger.setNumber(burgerNumber);
			burgerBlock.put(burger);
			System.out.println(name + " legger på hamburger ("+burger.getNumber()+") => " +  toString());
		
		}
		}

		public void takeBurger(String name) throws InterruptedException {
		
		if(isEmpty()) {
			System.out.println("###" + name +" vil ta en hamburger, men rutsjebanen er tom. Venter! ###");
		}
		
		if(!isEmpty()) {
		System.out.println(name+" tar av hamburger ("+burgerBlock.peek().getNumber()+") <= " + toString());
		}
		burgerBlock.take();
		
	}
	public boolean isFull() {
		return burgerBlock.size() >= maxBurgers;
	}
	public boolean isEmpty() {
		return burgerBlock.isEmpty();
	}
	public String toString() {
		
		String burgerNumbers = "[";
		for(var burger : burgerBlock) {
			burgerNumbers += "(" + burger.getNumber() + ")";
		}
		burgerNumbers += "]";
		return burgerNumbers;
	}
	
}
