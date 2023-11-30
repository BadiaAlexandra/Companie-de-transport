package dataobjects;

import jakarta.persistence.Entity;

@Entity
public class Categoria {
 private String nume;
 private String idLegitimatie;
 
public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public String getIdLegitimatie() {
	return idLegitimatie;
}

public void setIdLegitimatie(String idLegitimatie) {
	this.idLegitimatie = idLegitimatie;
}

@Override
public String toString() {
	return "Categoria [nume=" + nume + ", idLegitimatie=" + idLegitimatie + "]";
}

public Categoria(String nume, String idLegitimatie) {
	super();
	this.nume = nume;
	this.idLegitimatie = idLegitimatie;
}
}
