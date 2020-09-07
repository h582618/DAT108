package Caesar;

import java.util.Random;
public class Sampling {
	public static double[] cumulativeFrequencies(double[] frequencies){
		double[] toReturn = new double[frequencies.length];
		toReturn[0] = frequencies[0];
		for (int i = 1; i < frequencies.length; i++){
			toReturn[i] = toReturn[i-1] + frequencies[i];
		}
	return toReturn;
	}
	
	public static char randomElement(double[] frequencies){
		// frequencies.length skal v�re 26, alfabetfrekvenser
		Random gen = new Random();
		double randomNumber = gen.nextDouble();
		int whatElement = 0;
		double[] cumFreq = cumulativeFrequencies(frequencies);
		while (cumFreq[whatElement] < randomNumber){
			whatElement++;
		}
		char randomLetter = (char)('a' + whatElement);
		return randomLetter;
	}
}
