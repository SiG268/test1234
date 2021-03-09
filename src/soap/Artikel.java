package soap;

import java.io.Serializable;

public class Artikel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nummer;
	private String name;
	private int menge;
	private double profitabilitaet;

	public Artikel() {

	}

	public Artikel(int nummer, String name, int menge, double profitabilitaet) {
		this.nummer = nummer;
		this.name = name;
		this.menge = menge;
		this.profitabilitaet = profitabilitaet;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getProfitabilitaet() {
		return profitabilitaet;
	}

	public void setProfitabilitaet(float profitabilitaet) {
		this.profitabilitaet = profitabilitaet;
	}

	@Override
	public String toString() {
		return "Artikel [nummer=" + nummer + ", name=" + name + ", menge=" + menge + ", profitabilitaet="
				+ profitabilitaet + "]";
	}

}
