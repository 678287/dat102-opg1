package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

import java.util.ArrayList;

public class Filmarkiv implements FilmarkivADT {

	private Film[] tabell; // tabellen for filmene
	private int antall; // antall filmer

	public Filmarkiv(int maxSize) {
		tabell = new Film[maxSize]; // array med maksimal størrelse (eksempel Filmarkiv filmarkiv = new
									// Filmarkiv(10); vil gjøre at det kan maks være 10 filmer i arkivet.
		antall = 0; // antall filmer 0 by default
	}

	@Override
	
	public Film finnFilm(int nr) {

		for (Film film : tabell) { // går gjennom hele tabellen
			if (film.getFilmnr() == nr) { // retunerer filmen om filmnr er likt
				return film;
			}
		}
		return null; // retunerer null hvis ikke funnet
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall < tabell.length) { // skjekker om tabellen er full først

			tabell[antall] = nyFilm; // nye filmen som skal bli lagt til bestemt av verdien antall

			antall++; // oppdaterer antall

			System.out.println("Ny film lagt til arkivet");
		} else {
			System.out.println("Arkivet er fullt");
		}

	}

	@Override
	public boolean slettFilm(int filmnr) {

		if (filmnr >= 0 && filmnr < antall) {

			for (int i = filmnr; i < antall - 1; i++) {// flytter alle elementer etter filmnr en posisjon
				tabell[i] = tabell[i + 1];
			}

			tabell[antall - 1] = null; // setter filmnr som null

			antall--; // tar ned antallet filmer i arkivet

			return true; // retunerer true hvis den ble slettet
		}

		return false; // retunerer false hvis den ikke ble slettet
	}

	@Override
	public Film[] soekTittel(String delstreng) {

		ArrayList<Film> matcher = new ArrayList<>();

		for (Film film : tabell) {
			if (film.getTittel().contains(delstreng)) {
				matcher.toArray(new Film[0]);
			}
		}
		Film[] titler = new Film[matcher.size()];
		return matcher.toArray(titler);

	}

	@Override
	public Film[] soekProdusent(String delstreng) {

		ArrayList<Film> matcher = new ArrayList<>();

		for (Film film : tabell) {
			if (film.getFilmskaper().equals(delstreng)) {
				matcher.add(film);
				matcher.toArray(new Film[0]);
			}

		}
		Film[] filmskapere = new Film[matcher.size()];
		return matcher.toArray(filmskapere);
	}

	@Override
	public int antall(Sjanger sjanger) {

		int filmerMS = 0;

	    for (int i = 0; i < antall; i++) {
	        if (tabell[i] != null && tabell[i].getSjanger() == sjanger) {
	            filmerMS++;
	        }
	    }

	    System.out.println("Antall filmer av sjanger " + sjanger + ": " + filmerMS);
	    return filmerMS;

	}

	@Override
	public int antall() {

		return antall;
	}
}
