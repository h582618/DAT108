package Caesar;

public class CaesarCipher {
	public static String encryptCaesar(int rotate, String clearText){// rotate fra 0 til 25, ikke negativ!
		char[] clearTextArray = clearText.toCharArray();
		char[] encryptedTextArray = new char[clearTextArray.length];
		for (int i = 0; i < clearTextArray.length; i++){
			if (clearTextArray[i]>='a' && clearTextArray[i] <='z'){
				encryptedTextArray[i] = (char)('a' + (rotate + clearTextArray[i]-'a')% 26);
			} else if (clearTextArray[i]>='A' && clearTextArray[i] <='Z'){
				encryptedTextArray[i] = (char)('A' + (rotate + clearTextArray[i]-'A')% 26);
			}else{
				encryptedTextArray[i] = clearTextArray[i];
			}
		}
		String toReturn = new String(encryptedTextArray);
		return toReturn;
	
	}
}
