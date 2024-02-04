package no.hvl.data102.filmarkiv.impl;

import java.util.Objects;

public class Film {

	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int lanseringsdato;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		this.filmnr = 0;
		this.filmselskap = "";
		this.tittel = "";
		this.lanseringsdato = 0;
		this.sjanger = null;
		this.filmselskap = "";
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int lanseringsdato, Sjanger sjanger, String filmselskap) {

		this.setFilmnr(filmnr);
		this.setTittel(tittel);
		this.setLanseringsdato(lanseringsdato);
		this.setSjanger(sjanger);
		this.setFilmselskap(filmselskap);
	}

	
	
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLanseringsdato() {
		return lanseringsdato;
	}

	public void setLanseringsdato(int lanseringsdato) {
		this.lanseringsdato = lanseringsdato;
	}

	 public Sjanger getSjanger() {
                return sjanger;
        }

	 public void setSjanger(Sjanger sjanger) {
                this.sjanger = sjanger;
        }


	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(filmnr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return filmnr == other.filmnr;
	}
	
	
	 

}
	 