package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.*;
import no.hvl.data102.filmarkiv.impl.*;

public class FilmarkivMain {

	public static void main(String[] args) {
		FilmarkivADT filma = new Filmarkiv(100);
		Meny meny = new Meny(filma);
		meny.start();

		//tester metodene

	       System.out.println("Antall filmer av sjanger komedie: " + filma.antall(Sjanger.KOMEDIE));
	}
}
