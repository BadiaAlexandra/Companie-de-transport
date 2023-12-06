package dataobjects;

public class DateCategorie {
	// punem campurile de care avem nevoie
	// email, parola, idLegitimatie, numeCategorie
	private String email;
	private String parola;
	private String idLegitimatie;
	private String numeCategorie;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public String getIdLegitimatie() {
		return idLegitimatie;
	}
	public void setIdLegitimatie(String idLegitimatie) {
		this.idLegitimatie = idLegitimatie;
	}
	public String getNumeCategorie() {
		return numeCategorie;
	}
	public void setNumeCategorie(String numeCategorie) {
		this.numeCategorie = numeCategorie;
	}
	@Override
	public String toString() {
		return "DateCategorie [email=" + email + ", parola=" + parola + ", idLegitimatie=" + idLegitimatie
				+ ", numeCatelgorie=" + numeCategorie + "]";
	}
	
	public DateCategorie(String email, String parola, String idLegitimatie, String numeCategorie) {
		super();
		this.email = email;
		this.parola = parola;
		this.idLegitimatie = idLegitimatie;
		this.numeCategorie = numeCategorie;
	}
}