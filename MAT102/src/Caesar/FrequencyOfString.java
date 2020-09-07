package Caesar;

import java.io.*;
public class FrequencyOfString {
public static double[] frequencyOfString(String text){
		
		// 26 pga 26 bokstaver i det engelske alfabetet
		double[] frequencyTable = new double[26];
		char[] textAsArray = text.toCharArray();
		int numberOfLetters = 0;
		for (char c : textAsArray){
			if (c>='a' && c <='z'){
				frequencyTable[c-'a']++;
				numberOfLetters++;
			}
			if (c>='A' && c <='Z'){
				frequencyTable[c-'A']++;
				numberOfLetters++;
			}			
		}
		for (int i = 0; i < frequencyTable.length;i++){
			frequencyTable[i] /= numberOfLetters;
		}
		return frequencyTable;	
	}
	
	public static double[] frequencyOfFile(String fileName){
		double[] frequencyTable = new double[26];
		int numberOfLetters = 0;
		try{
			FileReader tekstFilLeser = new FileReader(fileName);
			BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
            int c = tekstLeser.read();
            while (c != -1){ // c = -1 svarer til end-of-file

                if (c >= 'a' && c <= 'z'){ // hvis c er en liten bokstav
                    frequencyTable[c-'a']++;
                }
                if (c >= 'A' && c <= 'Z'){ // hvis c er en stor bokstav
                	frequencyTable[c-'A']++;
                }
                c = tekstLeser.read();
            }
            tekstLeser.close();
            for (int i = 0; i< 26;i++){
                //System.out.printf("Antall " + (char)('a'+i) + " er %d\n", antallBokstaver[i]);
                numberOfLetters += frequencyTable[i];
            }
		
	} catch (Exception e){//Catch exception if any
        System.err.println("Error: " + e.getMessage());
    }
		for (int i = 0; i < frequencyTable.length;i++){
			frequencyTable[i] /= numberOfLetters;
		}
		return frequencyTable;
	}
	public static double[][] doubleFrequencyOfFile(String fileName){
		double[][] dobbelSample = new double[26][26];
        try{
            //Sett inn sti til filen som skal leses
            FileReader tekstFilLeser = new FileReader(fileName);
            BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
            int c = tekstLeser.read();
            while (!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z'))){ // sikrer at c representerer en bokstav
                c = tekstLeser.read();
            }
            while (c != -1){ // c = -1 svarer til end-of-file
                int d = tekstLeser.read();
                while (!((d >= 'a' && d <= 'z')||(d >= 'A' && d <= 'Z'))){ // sikrer at d representerer en bokstav
                    d = tekstLeser.read();
                    if (d == -1){ // d = -1 svarer til end-of-file
                        break;
                    }
                }
                if (c >= 'a' && c <= 'z'){ // hvis c er en liten bokstav
//                    antallBokstaver[c-'a']++;
                    if (d >= 'a' && d <= 'z'){
                        dobbelSample[c-'a'][d-'a']++;
                    }
                    if (d >= 'A' && d <= 'Z'){
                        dobbelSample[c-'a'][d-'A']++;
                    }
                }
                if (c >= 'A' && c <= 'Z'){ // hvis c er en stor bokstav
//                    antallBokstaver[c-'A']++;
                    if (d >= 'a' && d <= 'z'){
                        dobbelSample[c-'A'][d-'a']++;
                    }
                    if (d >= 'A' && d <= 'Z'){
                        dobbelSample[c-'A'][d-'A']++;
                    }
                }
                c = d;
            }         
            tekstLeser.close();

                
        } catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        for (int i = 0; i < 26; i++){
        	int numberOfGivenLetter = 0;
        	for (int j = 0; j < 26; j++){
        		numberOfGivenLetter += dobbelSample[i][j];
        	}
        	for (int j = 0; j < 26; j++){
        		dobbelSample[i][j] /= numberOfGivenLetter;
        	}
        }
		return dobbelSample;
	}

	public static double[][][] tripleFrequencyOfFile(String fileName){
		double[][][] tripleSample = new double[26][26][26];
        try{
            //Sett inn sti til filen som skal leses
            FileReader tekstFilLeser = new FileReader(fileName);
            BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
            int c = tekstLeser.read();
            while (!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z'))){ // sikrer at c representerer en bokstav
                c = tekstLeser.read();
            }
            while (c != -1){
            	int d = tekstLeser.read();
            	while (!((d >= 'a' && d <= 'z')||(d >= 'A' && d <= 'Z'))){ // sikrer at d representerer en bokstav
            		d = tekstLeser.read();
            	}
            	while (d != -1){
            		int e = tekstLeser.read();

            		if (c >= 'a' && c <= 'z'){ // hvis c er en liten bokstav
                      if (d >= 'a' && d <= 'z'){
                          if (e >= 'a' && e <= 'z'){
                        	  tripleSample[c-'a'][d-'a'][e-'a']++;
                          }
                          if (e >= 'A' && e <= 'Z'){
                        	  tripleSample[c-'a'][d-'a'][e-'A']++;
                          }
                      }
                      if (d >= 'A' && d <= 'Z'){
                          if (e >= 'a' && e <= 'z'){
                        	  tripleSample[c-'a'][d-'A'][e-'a']++;
                          }
                          if (e >= 'A' && e <= 'Z'){
                        	  tripleSample[c-'a'][d-'A'][e-'A']++;
                          }
                          
                      }
                  }
            	if (c >= 'A' && c <= 'Z'){ // hvis c er en stor bokstav
//                    antallBokstaver[c-'a']++;
                    if (d >= 'a' && d <= 'z'){
                        if (e >= 'a' && e <= 'z'){
                      	  tripleSample[c-'A'][d-'a'][e-'a']++;
                        }
                        if (e >= 'A' && e <= 'Z'){
                      	  tripleSample[c-'A'][d-'a'][e-'A']++;
                        }
                    }
                    if (d >= 'A' && d <= 'Z'){
                        if (e >= 'a' && e <= 'z'){
                      	  tripleSample[c-'A'][d-'A'][e-'a']++;
                        }
                        if (e >= 'A' && e <= 'Z'){
                      	  tripleSample[c-'A'][d-'A'][e-'A']++;
                        }
                        
                    }
                }
            		c = d;
            		d = e;
            	}
            	c = d; // sikrer at l�kken avsluttes korrekt.
            }
            tekstLeser.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
		for (int i = 0; i < 26; i++){
			for (int j = 0; j < 26; j++){
				int condprob = 0;
				for (int k = 0; k < 26; k++){
					condprob += tripleSample[i][j][k];
				}
				for (int k = 0; k < 26; k++){
					tripleSample[i][j][k] /= condprob;
				}
			}
		}
		return tripleSample;
	}

	public static double[][][][] quadrupleFrequencyOfFile(String fileName){
		double[][][][] quadrupleSample = new double[26][26][26][26];
		try{
	            FileReader tekstFilLeser = new FileReader(fileName);
	            BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
	            int c = tekstLeser.read();
	            while (!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z'))){ // sikrer at c representerer en bokstav
	                c = tekstLeser.read();
	            }
	            outerLoop:
	            while (c != -1){
	            	int d = tekstLeser.read();
	            	while (!((d >= 'a' && d <= 'z')||(d >= 'A' && d <= 'Z'))){ // sikrer at d representerer en bokstav
	            		d = tekstLeser.read();
	            	}
	            	while (d != -1){
	            		int e = tekstLeser.read();
	            		while (!((e >= 'a' && e <= 'z')||(e >= 'A' && e <= 'Z'))){ // sikrer at e representerer en bokstav
		            		e = tekstLeser.read();
		            	}
	            		while ( e != -1){
	            			int f = tekstLeser.read();
	            			if (f == -1){
	            				break outerLoop;
	            			}
	            			while (!((f >= 'a' && f <= 'z')||(f >= 'A' && f <= 'Z'))){ // sikrer at e representerer en bokstav
			            		f = tekstLeser.read();
		            			if (f == -1){
		            				break outerLoop;
		            			}
			            	}

	            			if (c >= 'a' && c <= 'z'){ // hvis c er en liten bokstav
	                            if (d >= 'a' && d <= 'z'){
	                                if (e >= 'a' && e <= 'z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'a'][d-'a'][e-'a'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'a'][d-'a'][e-'a'][f-'A']++;
	                                	}
	                                }
	                                if (e >= 'A' && e <= 'Z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'a'][d-'a'][e-'A'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'a'][d-'a'][e-'A'][f-'A']++;
	                                	}
	                                }
	                            }
	                            if (d >= 'A' && d <= 'Z'){
	                                if (e >= 'a' && e <= 'z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'a'][d-'A'][e-'a'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'a'][d-'A'][e-'a'][f-'A']++;
	                                	}
	                                }
	                                if (e >= 'A' && e <= 'Z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'a'][d-'A'][e-'A'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'a'][d-'A'][e-'A'][f-'A']++;
	                                	}
	                                }
	                            }
	            			}
	            			if (c >= 'A' && c <= 'Z'){ // hvis c er en stor bokstav
	                            if (d >= 'a' && d <= 'z'){
	                                if (e >= 'a' && e <= 'z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'A'][d-'a'][e-'a'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'A'][d-'a'][e-'a'][f-'A']++;
	                                	}
	                                }
	                                if (e >= 'A' && e <= 'Z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'A'][d-'a'][e-'A'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'A'][d-'a'][e-'A'][f-'A']++;
	                                	}
	                                }
	                            }
	                            if (d >= 'A' && d <= 'Z'){
	                                if (e >= 'a' && e <= 'z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'A'][d-'A'][e-'a'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'A'][d-'A'][e-'a'][f-'A']++;
	                                	}
	                                }
	                                if (e >= 'A' && e <= 'Z'){
	                                	if (f>= 'a' && f <= 'z' ){
	                                		quadrupleSample[c-'A'][d-'A'][e-'A'][f-'a']++;
	                                	}
	                                	if (f>= 'A' && f <= 'Z' ){
	                                		quadrupleSample[c-'A'][d-'A'][e-'A'][f-'A']++;
	                                	}
	                                }
	                            }
	            			}
		            		c = d;
		            		d = e;
		            		e = f;
	            			if (f == -1){
	            				break;
	            			}
	            		}
	            		c = d;
	            		d = e;
	            	}
	            	c = d;
	            }
	        tekstLeser.close();

		}catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
		for (int i = 0; i < 26; i++){
			for (int j = 0; j < 26; j++){
				for (int k = 0; k < 26; k++){
					int condprob = 0;
					for (int l = 0; l < 26; l++){
						condprob += quadrupleSample[i][j][k][l];
					}
					for (int l = 0; l < 26; l++){
						quadrupleSample[i][j][k][l] /= condprob;
					}
				}
			}
		}
		
		return quadrupleSample;
	}

}
