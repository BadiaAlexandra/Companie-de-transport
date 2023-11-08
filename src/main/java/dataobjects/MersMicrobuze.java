package dataobjects;

import java.util.List;

public class MersMicrobuze {
private List<Cursa>Curse;

public List<Cursa> getCurse() {
	return Curse;
}

public void setCurse(List<Cursa> curse) {
	Curse = curse;
}

@Override
public String toString() {
	return "MersMicrobuze [Curse=" + Curse + "]";
}

public MersMicrobuze(List<Cursa> curse) {
	super();
	Curse = curse;
}
}
