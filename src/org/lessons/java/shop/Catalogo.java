package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {
	
	public static void main(String[] args) {
		
//	BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti
//		con dati inseriti tramite scanner.
//	Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
//		e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//	Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni
//			da stampare per ogni classe)
		
		String nomeProdotto;
		String marcaProdotto;
		float prezzoProdotto;
		int ivaProdotto;
		
		int codiceIMEI;
		int dimensioneMemoriaTelefono;
		
		int dimensioniTelevisore;
		boolean modelloSmartTV;
		
		String cuffieColore;
		boolean cuffieWireless;
		
		//Smarphone newProdotto = new Smarphone(nome, marca, prezzo, iva, codiceIMEI, dimensioneMemoria);
		
//		System.out.println(newProdotto.getNome());
//		System.out.println(newProdotto.getMarca());
//		System.out.println(newProdotto.getPrezzo());
//		System.out.println(newProdotto.getPrezzoConIva());
//		System.out.println(newProdotto.getIva());
//		
//		System.out.println(newProdotto.getCodiceIMEI());
//		System.out.println(newProdotto.getDimensioneMemoria());
		
		System.out.println("Benvenuto, da questo pannello puoi inserire i prodotti nel catalogo!");
		
		boolean termina = false;
		int scelta;
		
		// Aperto scanner
		Scanner receiveInput = new Scanner(System.in);
		
		do {
			System.out.println("inserisci prodotto");
			System.out.print("Scegliere: 0 per Terminare: ");
			scelta = receiveInput.nextInt();
			termina = scelta == 0;
		} while (!termina);
		
		System.out.println("Programma terminato!");
		receiveInput.close();
		// Chiuso inputContainer
		
	}

}
