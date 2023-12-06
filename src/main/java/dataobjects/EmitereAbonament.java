package dataobjects;

public class EmitereAbonament {
	private String email;
	private String parola;
	private String plecare;
	private String sosire;
	private Integer valabilitate;
	private String startData;
	
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
	public String getPlecare() {
		return plecare;
	}
	public void setPlecare(String plecare) {
		this.plecare = plecare;
	}
	public String getSosire() {
		return sosire;
	}
	public void setSosire(String sosire) {
		this.sosire = sosire;
	}
	public Integer getValabilitate() {
		return valabilitate;
	}
	public void setValabilitate(Integer valabilitate) {
		this.valabilitate = valabilitate;
	}
	public String getStartData() {
		return startData;
	}
	public void setStartData(String startData) {
		this.startData = startData;
	}
	@Override
	public String toString() {
		return "EmitereAbonament [email=" + email + ", parola=" + parola + ", plecare=" + plecare + ", sosire=" + sosire
				+ ", valabilitate=" + valabilitate + ", startData=" + startData + "]";
	}
	public EmitereAbonament(String email, String parola, String plecare, String sosire, Integer valabilitate,
			String startData) {
		super();
		this.email = email;
		this.parola = parola;
		this.plecare = plecare;
		this.sosire = sosire;
		this.valabilitate = valabilitate;
		this.startData = startData;
	}	
}
