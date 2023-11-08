package dataobjects;

public class Tranzactie {
private String calator;
private String cursa;
private Integer pret;
private String dataTimpVanzare;
public String getCalator() {
	return calator;
}
public void setCalator(String calator) {
	this.calator = calator;
}
public String getCursa() {
	return cursa;
}
public void setCursa(String cursa) {
	this.cursa = cursa;
}
public Integer getPret() {
	return pret;
}
public void setPret(Integer pret) {
	this.pret = pret;
}
public String getDataTimpVanzare() {
	return dataTimpVanzare;
}
public void setDataTimpVanzare(String dataTimpVanzare) {
	this.dataTimpVanzare = dataTimpVanzare;
}
@Override
public String toString() {
	return "Tranzactie [calator=" + calator + ", cursa=" + cursa + ", pret=" + pret + ", dataTimpVanzare="
			+ dataTimpVanzare + "]";
}
public Tranzactie(String calator, String cursa, Integer pret, String dataTimpVanzare) {
	super();
	this.calator = calator;
	this.cursa = cursa;
	this.pret = pret;
	this.dataTimpVanzare = dataTimpVanzare;
}
}
