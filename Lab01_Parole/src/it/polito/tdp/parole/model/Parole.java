package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private String par;
	private List<String> elenco = new ArrayList<String>();
	
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

	
	
	
	

}
