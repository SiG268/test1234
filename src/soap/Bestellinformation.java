package soap;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.datatype.XMLGregorianCalendar;

public class Bestellinformation implements Serializable {
	int bestellnummer;
	XMLGregorianCalendar datum;
	float guv;
	HashMap<Integer, Artikel> artikel;

	public Bestellinformation() {

	}

	public Bestellinformation(int bestellnummer, XMLGregorianCalendar datum, float guv,
			HashMap<Integer, Artikel> artikel) {
		this.bestellnummer = bestellnummer;
		this.datum = datum;
		this.guv = guv;
		this.artikel = artikel;
	}

	public int getBestellnummer() {
		return bestellnummer;
	}

	public void setBestellnummer(int bestellnummer) {
		this.bestellnummer = bestellnummer;
	}

	public XMLGregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(XMLGregorianCalendar datum) {
		this.datum = datum;
	}

	public float getGuv() {
		return guv;
	}

	public void setGuv(float guv) {
		this.guv = guv;
	}

	public HashMap<Integer, Artikel> getArtikel() {
		return artikel;
	}

	public void setArtikel(HashMap<Integer, Artikel> artikel) {
		this.artikel = artikel;
	}

}
