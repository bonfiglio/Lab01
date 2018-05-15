package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private String par;
	private List<String> elenco = new ArrayList<String>(); 
	//  https://stackoverflow.com/questions/2279030/type-list-vs-type-arraylist-in-java
	
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		//TODO
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(elenco);
		return elenco;
	}
	
	public void reset() {
		// TODO
		elenco.clear();
	}
	
	public void cancella(String p) {
		elenco.remove(p);
	}

	
	
	
	

}
