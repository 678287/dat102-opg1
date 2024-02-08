package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.*;
import no.hvl.data102.filmarkiv.impl.*;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();

		this.filmarkiv = filmarkiv;
	}

	public void start() {

		Film shrek = new Film(1, "Andrew Adamson", "Shrek", 22062001, Sjanger.KOMEDIE, "Dreamworks");
		Film beemovie = new Film(2, "Simon smith", "Beemovie", 26122007, Sjanger.KOMEDIE, "Dreamworks");
		Film pulpfiction = new Film(3, "Quentin Tarantino", "Pulp fiction", 21101994, Sjanger.ACTION, "Miramax films");

		filmarkiv.leggTilFilm(shrek);
		filmarkiv.leggTilFilm(beemovie);
		filmarkiv.leggTilFilm(pulpfiction);

	}
}
