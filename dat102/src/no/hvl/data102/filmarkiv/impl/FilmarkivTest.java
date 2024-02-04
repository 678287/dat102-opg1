package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.impl.Sjanger;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmarkivTest {

	@Test
	public void test() {
		Filmarkiv filmarkiv = new Filmarkiv(10);
		assertEquals(0, filmarkiv.antall());
	}
	
	@Test
	public void testLeggTilFilm() {
	    Filmarkiv filmarkiv = new Filmarkiv(10);
	    assertEquals(0, filmarkiv.antall());

	    Film film1 = new Film(1, "Regissør1", "Film1", 2000, Sjanger.ACTION, "Selskap1");
	    filmarkiv.leggTilFilm(film1);

	    assertEquals(1, filmarkiv.antall());
	    assertEquals(film1, filmarkiv.finnFilm(1));
	}

	@Test
	public void testSoekTittel() {
	    Filmarkiv filmarkiv = new Filmarkiv(10);

	    Film film1 = new Film(1, "Regissør1", "Film1", 2022, Sjanger.ACTION, "Selskap1");
	    Film film2 = new Film(2, "Regissør2", "Film2", 2023, Sjanger.FANTASY, "Selskap2");
	    filmarkiv.leggTilFilm(film1);
	    filmarkiv.leggTilFilm(film2);

	    Film[] result = filmarkiv.soekTittel("Film1");
	    assertEquals(1, result.length);
	    assertEquals(film1, result[0]);
	}

}