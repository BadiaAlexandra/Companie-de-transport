package dataobjects;

public class Cursa {
private Ruta ruta;
private Integer cod;
private Integer timpPlecare;
private Integer timpSosire;
private Program program;
public Ruta getRuta() {
	return ruta;
}
public void setRuta(Ruta ruta) {
	this.ruta = ruta;
}
public Integer getCod() {
	return cod;
}
public void setCod(Integer cod) {
	this.cod = cod;
}
public Integer getTimpPlecare() {
	return timpPlecare;
}
public void setTimpPlecare(Integer timpPlecare) {
	this.timpPlecare = timpPlecare;
}
public Integer getTimpSosire() {
	return timpSosire;
}
public void setTimpSosire(Integer timpSosire) {
	this.timpSosire = timpSosire;
}
public Program getProgram() {
	return program;
}
public void setProgram(Program program) {
	this.program = program;
}
@Override
public String toString() {
	return "Cursa [ruta=" + ruta + ", cod=" + cod + ", timpPlecare=" + timpPlecare + ", timpSosire=" + timpSosire
			+ ", program=" + program + "]";
}
public Cursa(Ruta ruta, Integer cod, Integer timpPlecare, Integer timpSosire, Program program) {
	super();
	this.ruta = ruta;
	this.cod = cod;
	this.timpPlecare = timpPlecare;
	this.timpSosire = timpSosire;
	this.program = program;
}

}
