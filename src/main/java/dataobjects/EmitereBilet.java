package dataobjects;

public class EmitereBilet {
	private String email;
	private String parola;
	private Integer idCursa;
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
	public Integer getIdCursa() {
		return idCursa;
	}
	public void setIdCursa(Integer idCursa) {
		this.idCursa = idCursa;
	}
	public EmitereBilet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmitereBilet [email=" + email + ", parola=" + parola + ", idCursa=" + idCursa + "]";
	}
	public EmitereBilet(String email, String parola, Integer idCursa) {
		super();
		this.email = email;
		this.parola = parola;
		this.idCursa = idCursa;
	}
}
