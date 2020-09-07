package Oppgave1252;

import java.util.HashMap;
import Caesar.*;

public class Main {

	public static void main(String [] args) {
		eComparison("jgnnq yjgtg ctg vjg ogcn");
	}
	
	public static void eComparison(String input) {
		
		char mestBrukt = mostUsedChar(input).charAt(0);
		
		char[] alfabetet = alpabeth();
		
		
		int rotasjon = 0;
		for(int i=0; i<alfabetet.length; i++) {
			if(mestBrukt==alfabetet[i]) {
				if(i>=4) {
					rotasjon = i-4;
				} else {
					rotasjon = i + 26 - 4;
				}
				
			}
		}
		String dekryptert = CaesarCipher.encryptCaesar(26-rotasjon,input);
		
		System.out.println(dekryptert);
	}
	
	
	public static char[] alpabeth() {
		char[] alphabet = new char[26]; // new array
        
        
        for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
        {
            alphabet[ch-'a']=ch;
        } 
        return alphabet;
	}
	
	public static String mostUsedChar(String text) {
		String mostUsedChar = "";
        int count = 0;

        String[] array = text.split("");

        for (int i = 0; i < array.length; i++) {
            int tempCount = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[i].equals(array[j])) {
                    tempCount++;
                }
                if (tempCount > count) {
                    count = tempCount;
                    mostUsedChar = array[i];
                }
            }
        }
        return mostUsedChar;
	}
	
}

