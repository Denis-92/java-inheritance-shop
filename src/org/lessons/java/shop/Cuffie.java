package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	//- Cuffie, caratterizzate dal colore e se sono wireless o cablate
	
	private String colore;
	private boolean wireless;
	
	public Cuffie(String nome, String marca, float prezzo, int iva, String colore, boolean wireless) {
		super(nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	public String getColore() {
		return colore;
	}
	
	public boolean getWireless() {
		return wireless;
	}

}
