package no.hvl.data102.filmarkiv.klient;

import java.util.Arrays;

import no.hvl.data102.filmarkiv.adt.*;
import no.hvl.data102.filmarkiv.impl.*;

public class FilmarkivMain {

	public static void main(String[] args) {
		FilmarkivADT filma = new Filmarkiv(100);
		Meny meny = new Meny(filma);
		meny.start();
		
		//tester noen metoder
		
		System.out.println("Antall filmer av sjanger komedie: " + filma.antall(Sjanger.KOMEDIE));
		System.out.println("Finn info om film nr 1: " + filma.finnFilm(1));
		System.out.println("Søk etter film med tittel: " + Arrays.toString(filma.soekTittel("Beemovie")));
		System.out.println("Søk produsent: " + Arrays.toString(filma.soekProdusent("Andrew Adamson")));
		System.out.println("Antall: " + filma.antall());



	}
}
