package Uke35;

import javax.imageio.IIOException;

public class Melding {

	String innhold;
	public boolean mottatt = true;

	public String getInnhold() {
		
			return innhold;
	}

	public void send(String innhold) {
		this.innhold = innhold;
		mottatt = false;
	}
	public boolean erMotatt() {
		return mottatt;//harMotatt;
	}
}
