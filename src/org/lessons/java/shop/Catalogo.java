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
		
		boolean newRecord;
		int scelta;
		
		boolean sceltoTelefono = false;
		boolean sceltoTv = false;
		boolean sceltoCuffie= false;
		
		
		// Aperto scanner
		Scanner receiveInput = new Scanner(System.in);
		
		do {
			System.out.println("Che tipo di prodotto vuoi inserire?");
			System.out.print("Scegliere: 1 per Telefono - 2 per Televisore - 3 per Cuffie ");
			scelta = receiveInput.nextInt();
			sceltoTelefono = scelta == 1;
			sceltoTv = scelta == 2;
			sceltoCuffie= scelta == 3;
				
			
			if (!sceltoTelefono && !sceltoTv && !sceltoCuffie)
				System.out.println("Errore! Scegliere un valore valido.");
			else {
				if (sceltoTelefono) System.out.println("Inserito telefono");
				if (sceltoTv) System.out.println("Inserito tv");
				if (sceltoCuffie) System.out.println("Inserito cuffie");
			}
			
			System.out.print("Scegliere 0 per Continuare ");
			scelta = receiveInput.nextInt();
			newRecord = scelta == 0;
		} while (newRecord);
		
		receiveInput.close();
		// Chiuso inputContainer
		
		System.out.println("Programma terminato!");
		
	}

}
