package pakke1;

public class F06D {

	
	@FunctionalInterface
	interface Betingelse {
		boolean erOppfylt(String x);
	}
	
	private static void betingetUtskrift(String s, Betingelse b) {
		if(b.erOppfylt(s)) {
			System.out.println(s);
		} else {
			System.out.println("Ikke sant");
		}
	}
	
	public static void main(String[] args) {
	
		betingetUtskrift("Anne", s -> s.charAt(0) == 'X');

		
		betingetUtskrift("Hei", s -> s.length() > 3);
	}

}
