package org.lessons.java.shop;

import java.util.Random;
import java.text.DecimalFormat;

public class Prodotto {
	
//	Creare la classe Prodotto che gestisce i prodotti dello shop.
//	Un prodotto è caratterizzato da:
//	- codice (numero intero)
//	- nome
//	- marca
//	- prezzo
//	- iva
//	
//	Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
//		ed eventuali altri metodi di “utilità” per fare in modo che:
//	- il codice prodotto sia accessibile solo in lettura
//	- gli altri attributi siano accessibili sia in lettura che in scrittura
//	- il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
//	Lo shop gestisce diversi tipi di prodotto:
//	- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//	- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//	- Cuffie, caratterizzate dal colore e se sono wireless o cablate
//	
//	Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi
//		che gestiscono i vari sotto tipi di prodotto.
//		
//	BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti
//		con dati inseriti tramite scanner.
//	Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
//		e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//	Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni
//			da stampare per ogni classe)
	
	private static final DecimalFormat formatta = new DecimalFormat("0.00");
	
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto(String nome, String marca, float prezzo, int iva) {
		super();
		Random makeRandom = new Random();
		codice = makeRandom.nextInt() & Integer.MAX_VALUE;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	public String getPrezzoConIva() {
		float prezzoConIva = prezzo * (iva + 100) / 100F;
		return formattaImporto(prezzoConIva);
	}
	
	private String formattaImporto (float saldo) {
		String importoFormattato = formatta.format(saldo);
		return importoFormattato;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", iva="
				+ iva + "]";
	}
	

}
