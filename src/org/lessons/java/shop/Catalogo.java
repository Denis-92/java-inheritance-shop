package org.lessons.java.shop;

public class Catalogo {
	
	public static void main(String[] args) {
		
//	BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti
//		con dati inseriti tramite scanner.
//	Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
//		e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//	Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni
//			da stampare per ogni classe)
		
		String nome = "NomeTEST";
		String marca = "MarcaTEST";
		float prezzo = 123.45F;
		int iva = 21;
		
		Prodotto newProdotto = new Prodotto(nome, marca, prezzo, iva);
		
		System.out.println(newProdotto.getNome());
		System.out.println(newProdotto.getMarca());
		System.out.println(newProdotto.getPrezzo());
		System.out.println(newProdotto.getPrezzoConIva());
		System.out.println(newProdotto.getIva());
		
		
	}

}
