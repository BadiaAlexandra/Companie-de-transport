package dataobjects;

import java.util.ArrayList;
import java.util.List;

public class Calator {
 private String cnp;
 private String email;
 private String parola;
 private String nume;
 private String prenume;
 private Categoria categoria;
 private List<Abonament> abonamente;
 
public String getCnp() {
	return cnp;
}
public void setCnp(String cnp) {
	this.cnp = cnp;
}
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
public String getNume() {
	return nume;
}
@Override
public String toString() {
	return "Calator [cnp=" + cnp + ", email=" + email + ", parola=" + parola + ", nume=" + nume + ", prenume=" + prenume
			+ ", categoria=" + categoria + "]";
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getPrenume() {
	return prenume;
}
public void setPrenume(String prenume) {
	this.prenume = prenume;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public List<Abonament> getAbonamente() {
	return abonamente;
}
public void setAbonamente(List<Abonament> abonamente) {
	this.abonamente = abonamente;
}
public void AddAbonament(Abonament abonament)
{
	this.abonamente.add(abonament);
}

public Calator(String cnp, String email, String parola, String nume, String prenume) {
	super();
	this.cnp = cnp;
	this.email = email;
	this.parola = parola;
	this.nume = nume;
	this.prenume = prenume;
	this.categoria = null;
	this.abonamente = new ArrayList<Abonament>();
}
}
