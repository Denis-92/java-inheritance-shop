package org.lessons.java.shop;

public class Smarphone extends Prodotto {
	//- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	
	private int codiceIMEI;
	private int dimensioneMemoria;
	
	public Smarphone(String nome, String marca, float prezzo, int iva, int codiceIMEI, int dimensioneMemoria) {
		super(nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.dimensioneMemoria = dimensioneMemoria;
		
	}

}
