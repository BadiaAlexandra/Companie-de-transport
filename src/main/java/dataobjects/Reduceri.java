package dataobjects;

import java.util.Map;

public class Reduceri {
	Map<Categoria, Integer> reduceri;

	public Map<Categoria, Integer> getReduceri() {
		return reduceri;
	}

	public void setReduceri(Map<Categoria, Integer> reduceri) {
		this.reduceri = reduceri;
	}

	@Override
	public String toString() {
		return "Reduceri [reduceri=" + reduceri + "]";
	}

	public Reduceri(Map<Categoria, Integer> reduceri) {
		super();
		this.reduceri = reduceri;
	}
	
	
}
