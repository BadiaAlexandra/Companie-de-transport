package dataobjects;

public class Bilet {
	private Integer pret;

	public Integer getPret() {
		return pret;
	}

	public void setPret(Integer pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Bilet [pret=" + pret + "]";
	}

	public Bilet(Integer pret) {
		super();
		this.pret = pret;
	}
	
}
