package dataobjects;

public class Cursa {
private Ruta ruta;
private Integer cod;
private String timpPlecare;
private String timpSosire;
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
public String getTimpPlecare() {
	return timpPlecare;
}
public void setTimpPlecare(String timpPlecare) {
	this.timpPlecare = timpPlecare;
}
public String getTimpSosire() {
	return timpSosire;
}
public void setTimpSosire(String timpSosire) {
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
public Cursa(Ruta ruta, Integer cod, String timpPlecare, String timpSosire, Program program) {
	super();
	this.ruta = ruta;
	this.cod = cod;
	this.timpPlecare = timpPlecare;
	this.timpSosire = timpSosire;
	this.program = program;
}

public Cursa()
{
}

}
