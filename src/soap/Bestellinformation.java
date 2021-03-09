package soap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class Bestellinformation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bestellnummer;
	private XMLGregorianCalendar datum;
	private double guv;
	List<Artikel> artikel = new ArrayList<Artikel>();

	public List<Artikel> getArtikel() {
		return artikel;
	}

	public void setArtikel(List<Artikel> artikel) {
		this.artikel = artikel;
	}

	public Bestellinformation() {

	}

	public Bestellinformation(int bestellnummer, XMLGregorianCalendar datum, float guv, List<Artikel> artikel) {
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

	public double getGuv() {
		return guv;
	}

	public void setGuv(double guv) {
		this.guv = guv;
	}

	@Override
	public String toString() {
		return "Bestellinformation [bestellnummer=" + bestellnummer + ", datum=" + datum + ", guv=" + guv + ", artikel="
				+ artikel + "]";
	}

}
