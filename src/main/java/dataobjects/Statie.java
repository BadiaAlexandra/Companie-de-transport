package dataobjects;

public class Statie {
	 private String nume;
	 private String oras;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}
	@Override
	public String toString() {
		return "Statie [nume=" + nume +  ", oras=" + oras + "]";
	}
	public Statie(String nume, String oras) {
		super();
		this.nume = nume;
		this.oras = oras;
	}
}
