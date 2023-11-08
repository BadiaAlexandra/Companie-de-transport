package dataobjects;

public class Program {
private boolean luni;
private boolean marti;
private boolean  miercuri;
private boolean joi;
private boolean vineri;
private boolean sambata;
private boolean duminica;
public boolean isLuni() {
	return luni;
}
public void setLuni(boolean luni) {
	this.luni = luni;
}
public boolean isMarti() {
	return marti;
}
public void setMarti(boolean marti) {
	this.marti = marti;
}
public boolean isMiercuri() {
	return miercuri;
}
public void setMiercuri(boolean miercuri) {
	this.miercuri = miercuri;
}
public boolean isJoi() {
	return joi;
}
public void setJoi(boolean joi) {
	this.joi = joi;
}
public boolean isVineri() {
	return vineri;
}
public void setVineri(boolean vineri) {
	this.vineri = vineri;
}
public boolean isSambata() {
	return sambata;
}
public void setSambata(boolean sambata) {
	this.sambata = sambata;
}
public boolean isDuminica() {
	return duminica;
}
public void setDuminica(boolean duminica) {
	this.duminica = duminica;
}
public Program(boolean luni, boolean marti, boolean miercuri, boolean joi, boolean vineri, boolean sambata,
		boolean duminica) {
	super();
	this.luni = luni;
	this.marti = marti;
	this.miercuri = miercuri;
	this.joi = joi;
	this.vineri = vineri;
	this.sambata = sambata;
	this.duminica = duminica;
}
@Override
public String toString() {
	return "Program [luni=" + luni + ", marti=" + marti + ", miercuri=" + miercuri + ", joi=" + joi + ", vineri="
			+ vineri + ", sambata=" + sambata + ", duminica=" + duminica + "]";
}

}
