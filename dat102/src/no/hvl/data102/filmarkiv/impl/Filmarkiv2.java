package no.hvl.data102.filmarkiv.impl;

import java.util.ArrayList;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

	private int antall; // antall filmer
	private LinearNode<Film> start; // Starten av linære kjeden

	public Filmarkiv2(int maxSize) {
		start = null; // starten av den linære kjeden er null siden ingen filmer er lagt til enda
		antall = 0; // antall filmer starter 0
	}

	@Override
	public Film finnFilm(int nr) {
		LinearNode<Film> temp = start; // Start fra begynnelsen
		while (temp != null) { // Går gjennom kjeden som har blitt fyllt inn
			if (temp.data.getFilmnr() == nr) { // vis nummeret du har lagt in stemmer med et nr i kjeden vil den returne
												// filmen
				return temp.data;
			}
			temp = temp.neste; // vis ikke vil den gå til kjeden sin neste node som er fyllet inn
		}
		return null; // returner null vis filmen ikke er funnet
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> ny = new LinearNode<>(nyFilm);// Ny node med den nye filmen
		ny.neste = start; // Sett den nye noden som den første i kjeden
		start = ny; // Oppdater starten av kjeden til den nye noden
		antall++; // Øk antall filmer
		System.out.println("Ny film lagt til arkivet");
	}

	@Override
	public boolean slettFilm(int filmnr) {
		return true;
	}

	@Override
	public Film[] soekTittel(String delstreng) {

		ArrayList<Film> matcher = new ArrayList<>();

		LinearNode<Film> temp = start;
		while (temp != null) {
			if (temp.data.getTittel().contains(delstreng)) {
				matcher.add(temp.data);
			}
			temp = temp.neste;
		}

		Film[] resultater = new Film[matcher.size()];
		return matcher.toArray(resultater);
	}

	@Override
	public Film[] soekProdusent(String delstreng) {

		ArrayList<Film> matcher = new ArrayList<>();

		LinearNode<Film> temp = start;
		while (temp != null) {
			if (temp.data.getFilmskaper().contains(delstreng)) {
				matcher.add(temp.data);
			}
			temp = temp.neste;
		}

		Film[] resultater = new Film[matcher.size()];
		return matcher.toArray(resultater);
	}

	@Override
	public int antall(Sjanger sjanger) {
		int filmer = 0;
		LinearNode<Film> temp = start;
		while (temp != null) {
			if (temp.data.getSjanger() == sjanger) {
				filmer++;
			}
			temp = temp.neste;
		}
		return filmer;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return antall;
	}
}
