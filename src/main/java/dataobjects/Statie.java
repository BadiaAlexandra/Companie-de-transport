package dataobjects;

public class Statie {
	 private String nume;
	 private String adresa;
	 private String oras;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}
	@Override
	public String toString() {
		return "Statie [nume=" + nume + ", adresa=" + adresa + ", oras=" + oras + "]";
	}
	public Statie(String nume, String adresa, String oras) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.oras = oras;
	}
}
