package no.hvl.data102.filmarkiv.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FilmarkivTest {

	private Filmarkiv filmarkiv;
	private Film film1;
	private Film film2;

	@Before
	public void forAlle() {
		filmarkiv = new Filmarkiv(10);

		film1 = new Film(1, "Regissør1", "Film1", 2020, Sjanger.ACTION, "Selskap1");
		film2 = new Film(2, "Regissør2", "Film2", 2020, Sjanger.KOMEDIE, "Selskap2");
		filmarkiv.leggTilFilm(film1);
		filmarkiv.leggTilFilm(film2);
	}

	@Test
	public void testLeggTilFilm() {
		assertEquals(2, filmarkiv.antall());

		Film nyFilm = new Film(3, "Regissør3", "Film3", 2002, Sjanger.DRAMA, "Selskap3");
		filmarkiv.leggTilFilm(nyFilm);

		assertEquals(3, filmarkiv.antall());
		assertEquals(nyFilm, filmarkiv.finnFilm(3));
	}

	@Test
	public void testSoekTittel() {
		Film[] result = filmarkiv.soekTittel("Film1");
		assertEquals(1, result.length);
		assertEquals(film1, result[0]);
	}

	@Test
	public void testSoekProdusent() {
		Film[] result = filmarkiv.soekProdusent("Regissør2");
		assertEquals(1, result.length);
		assertEquals(film2, result[0]);
	}

	@Test
	public void testAntallSjanger() {
		assertTrue(filmarkiv.antall(Sjanger.ACTION) > 0);
		assertFalse(filmarkiv.antall(Sjanger.FANTASY) < 0);
		assertTrue(filmarkiv.antall(Sjanger.KOMEDIE) > 0);
	}

	@Test
	public void testAntallTotalt() {
		assertEquals(2, filmarkiv.antall());
	}
}
