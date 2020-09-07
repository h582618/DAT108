package Caesar;

public class Main {

	public static void main(String[] args) {
		
		String testStreng = "Heisann!";
		double[] frekvensTabell = FrequencyOfString.frequencyOfString(testStreng);
		//System.out.println("Frekvens i en streng:");
		for (int i = 0; i < frekvensTabell.length; i++){
		    //System.out.println(frekvensTabell[i]);
		}
		
		String filNavn = "/Users/matia/Downloads/macbeth";//path
		double[] MacbethTabell = FrequencyOfString.frequencyOfFile(filNavn);
		
		double[][] conMacbethTabell = FrequencyOfString.doubleFrequencyOfFile(filNavn);
		System.out.println("Relativ frekvens av et par:");
		System.out.println(conMacbethTabell[1][0]); //ba
		System.out.println(conMacbethTabell[16][20]); // qu

		String skalKrypteres = "tmdde";
		System.out.println(skalKrypteres);
		String kryptert = CaesarCipher.encryptCaesar(9,skalKrypteres);
		System.out.println(kryptert);
		String dekryptert = CaesarCipher.encryptCaesar(26-9,kryptert);
		System.out.println(dekryptert);
		

		
		String encryptedText = "tmdde";
		int faktor = encryptedText.length();

		//Skal holde kji-kvadrat for 26 muligheter
		double[] roterteKjiKvadrat = new double[26];
		for (int i = 0; i < 26; i++){
		    String rotert = CaesarCipher.encryptCaesar(i, encryptedText);
		    double[] rotertFrekvensTabell = FrequencyOfString.frequencyOfString(rotert);
		    roterteKjiKvadrat[i] = ChiSquare.computeChiSquare(rotertFrekvensTabell, MacbethTabell);
		    String decryptedText2 = CaesarCipher.encryptCaesar(i, encryptedText);
		    System.out.print(decryptedText2);
		    System.out.printf("\n %.1f\n", faktor*roterteKjiKvadrat[i]);
		}

	}

}
