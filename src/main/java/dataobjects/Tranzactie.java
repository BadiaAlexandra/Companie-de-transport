package dataobjects;

public class Tranzactie {
private String calator;
private Integer codCursa;
private Integer pret;
private String dataTimpVanzare;

public String getCalator() {
	return calator;
}
public void setCalator(String calator) {
	this.calator = calator;
}
public Integer getCursa() {
	return codCursa;
}
public void setCursa(Integer cursa) {
	this.codCursa = cursa;
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
	return "Tranzactie [calator=" + calator + ", cursa=" + codCursa + ", pret=" + pret + ", dataTimpVanzare="
			+ dataTimpVanzare + "]";
}
public Tranzactie(String calator, Integer cursa, Integer pret, String dataTimpVanzare) {
	super();
	this.calator = calator;
	this.codCursa = cursa;
	this.pret = pret;
	this.dataTimpVanzare = dataTimpVanzare;
}
}
