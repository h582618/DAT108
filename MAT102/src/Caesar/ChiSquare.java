package Caesar;

public class ChiSquare {
	
	public static double computeChiSquare(double[] observedFrequencies, double[] referenceFrequencies){
		// Tabellene skal ha samme lengde.
		double toReturn = 0;
		for (int i = 0; i < observedFrequencies.length; i++){
			toReturn += (observedFrequencies[i] - referenceFrequencies[i])*(observedFrequencies[i] - referenceFrequencies[i])/referenceFrequencies[i];
		}
		return toReturn;
	}
}
