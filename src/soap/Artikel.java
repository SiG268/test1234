package soap;

import java.io.Serializable;

public class Artikel implements Serializable {
	int nummer;
	String name;
	int menge;
	float profitabilitaet;

	public Artikel() {

	}

	public Artikel(int nummer, String name, int menge, float profitabilitaet) {
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

	public float getProfitabilitaet() {
		return profitabilitaet;
	}

	public void setProfitabilitaet(float profitabilitaet) {
		this.profitabilitaet = profitabilitaet;
	}

}
