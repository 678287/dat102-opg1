package no.hvl.data102.filmarkiv.klient;

import java.util.Scanner;
import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.*;

public class Tekstgrensesnitt {

	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv inn film detaljer");

		System.out.print("Filmnummer: ");
		int filmnr = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Filmprodusent: ");
		String filmskaper = scanner.nextLine();

		System.out.print("Tittel: ");
		String tittel = scanner.nextLine();

		System.out.print("Lanseringsdato: ");
		int lanseringsdato = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Sjanger: ");
		String sjangerString = scanner.nextLine();
		Sjanger sjanger = Sjanger.valueOf(sjangerString.toUpperCase());

		System.out.print("Filmselskap: ");
		String filmselskap = scanner.nextLine();

		scanner.close();

		Film film = new Film(filmnr, filmskaper, tittel, lanseringsdato, sjanger, filmselskap);
		return film;

	}

	// TODO

	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {

		System.out.println(film.toString());
		// TODO
	}

	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {

		System.out.println(arkiv.soekTittel(delstreng));

		// TODO
	}

	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {

		System.out.println(arkiv.soekProdusent(delstreng));

		// TODO
	}

	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmarkivADT arkiv) {

		/*
		 * System.out.println("Antall filmer i arkiv: " + arkiv.antall()); for(arkiv :
		 * sjanger) {
		 * 
		 * }
		 * 
		 */
		// TODO
	}

	// osv ... andre metoder
}
