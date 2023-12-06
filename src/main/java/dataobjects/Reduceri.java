package dataobjects;

import java.util.Map;

public class Reduceri {
	Map<String, Integer> reduceri;

	public Map<String, Integer> getReduceri() {
		return reduceri;
	}

	public void setReduceri(Map<String, Integer> reduceri) {
		this.reduceri = reduceri;
	}

	@Override
	public String toString() {
		return "Reduceri [reduceri=" + reduceri + "]";
	}

	public Reduceri(Map<String, Integer> reduceri) {
		super();
		this.reduceri = reduceri;
	}	
}
