package org.lessons.java.shop;

public class Televisore extends Prodotto {
	//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	
	private int dimensioniTelevisore;
	private boolean modelloSmart;
	
	public Televisore(String nome, String marca, float prezzo, int iva, int dimensioniTelevisore, boolean modelloSmart) {
		super(nome, marca, prezzo, iva);
		this.dimensioniTelevisore = dimensioniTelevisore;
		this.modelloSmart = modelloSmart;
	}
	
	public int getDimensioniTelevisore() {
		return dimensioniTelevisore;
	}
	
	public boolean getModelloSmart() {
		return modelloSmart;
	}

}
