package jana60.shop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Catalogo


{
	public static void main(String[] args)
	{
		//variabili - scanner e decimali
		DecimalFormat df= new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
	

		String marca,nome;
		double prezzoBase;
		int iva;
		
		//arrey del catalogo
		Prodotto[] prodotti= new Prodotto[2];
		
		//ciclo per chiedere le specifiche dei prodotti
		
		for (int i= 0; i<prodotti.length; i++)
		{
			System.out.print("Inserisci la marca del " + (i+1) + "° prodotto: ");
			marca = scan.nextLine();
			//Assegnazione valore del nome del prodotto.
			System.out.print("Inserisci il nome del " + (i+1) + "° prodotto: ");
			nome = scan.nextLine();
			//Assegnazione valore del prezzo del prodotto.
			System.out.print("Inserisci il prezzo del " + (i+1) + "° prodotto: ");
			prezzoBase = Double.parseDouble(scan.nextLine());
			//Assegnazione valore dell'iva sul prodotto.
			System.out.print("Inserisci la percentuale dell'iva sul " + (i+1) + "° prodotto: ");
			iva = Integer.parseInt(scan.nextLine());
			
		
			
			prodotti[i] = new Prodotto(marca, nome, prezzoBase, iva);
	
		}
		//Stampa indice della tabella.
				System.out.format("%25s %10s %25s %10s %10s %10s %10s", "Nome del prodotto", "|", "Marca del prodotto", "|", "Prezzo (€)", "|", "Prezzo + IVA");
				//Per mandare a capo il separatore
				System.out.println();
				//Separatore che divide l'indice dal corpo della tabella
				System.out.format("%s", "---------------------------------------------------------------------------------------------------------------------");
				//Ciclo per stampare i valori di ogni oggetto dell'array.
				for(int i=0; i < prodotti.length; i++) {
					//Print per far andare a capo la riga della tabella.
					System.out.println();
					//Separazione del 25% dello spazio a sua disposizione per la stringa nome e quella marca del prodotto, per i prezzi float invece solo il 10% stesso valore assegnato ai separatori.
					System.out.format("%25s %10s %25s %10s %10.2f %10s %10.2f", prodotti[i].nome, "|", prodotti[i].marca, "|", prodotti[i].prezzoBase, "|",prodotti[i].prezzoTotale());
					
				}
				//Chiusura dello scanner.
				scan.close();
	}
			
}
