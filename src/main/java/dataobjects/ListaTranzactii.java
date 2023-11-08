package dataobjects;

import java.util.List;

public class ListaTranzactii {
private List<Tranzactie>Tranzactii;

public List<Tranzactie> getTranzactii() {
	return Tranzactii;
}

public void setTranzactii(List<Tranzactie> tranzactii) {
	Tranzactii = tranzactii;
}

@Override
public String toString() {
	return "ListaTranzactii [Tranzactii=" + Tranzactii + "]";
}

public ListaTranzactii(List<Tranzactie> tranzactii) {
	super();
	Tranzactii = tranzactii;
}
}
