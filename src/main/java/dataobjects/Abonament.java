package dataobjects;

public class Abonament {
	private String statiePlecare;
	private String statieSosire;
	private Integer pret;
	private String dataStart;
	private Integer valabilitate;
	
	// tema: dataStart, valabilitate
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
	public String getDataStart() {
		return dataStart;
	}
	public void setDataStart(String dataStart) {
		this.dataStart = dataStart;
	}
	public Integer getValabilitate() {
		return valabilitate;
	}
	public void setValabilitate(Integer valabilitate) {
		this.valabilitate = valabilitate;
	}
	
	@Override
	public String toString() {
		return "Abonament [statiePlecare=" + statiePlecare + ", statieSosire=" + statieSosire + ", pret=" + pret
				+ ", dataStart=" + dataStart + ", valabilitate=" + valabilitate + "]";
	}
	public Abonament(String statiePlecare, String statieSosire, Integer pret, String dataStart, Integer valabilitate) {
		super();
		this.statiePlecare = statiePlecare;
		this.statieSosire = statieSosire;
		this.pret = pret;
		this.dataStart = dataStart;
		this.valabilitate = valabilitate;
	}
}
