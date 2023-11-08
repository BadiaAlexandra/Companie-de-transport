package dataobjects;

public class Abonament {
	private String statiePlecare;
	private String statieSosire;
	private Integer pret;
	public String getStatiePlecare() {
		return statiePlecare;
	}
	public void setStatiePlecare(String statiePlecare) {
		this.statiePlecare = statiePlecare;
	}
	public String getStatieSosire() {
		return statieSosire;
	}
	public void setStatieSosire(String statieSosire) {
		this.statieSosire = statieSosire;
	}
	public Integer getPret() {
		return pret;
	}
	public void setPret(Integer pret) {
		this.pret = pret;
	}
	@Override
	public String toString() {
		return "Abonament [statiePlecare=" + statiePlecare + ", statieSosire=" + statieSosire + ", pret=" + pret + "]";
	}
	public Abonament(String statiePlecare, String statieSosire, Integer pret) {
		super();
		this.statiePlecare = statiePlecare;
		this.statieSosire = statieSosire;
		this.pret = pret;
	}
}
