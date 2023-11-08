package dataobjects;

import java.util.List;

public class Ruta {
 private Integer id;
 private List<Statie> traseu;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public List<Statie> getTraseu() {
	return traseu;
}
public void setTraseu(List<Statie> traseu) {
	this.traseu = traseu;
}
@Override
public String toString() {
	return "Ruta [id=" + id + ", traseu=" + traseu + "]";
}
public Ruta(Integer id, List<Statie> traseu) {
	super();
	this.id = id;
	this.traseu = traseu;
}
 
}
