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
		Prodotto[] prodotti= new Prodotto[5];
		
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
			System.out.println(prodotti[i].descrizioneFinale());
		}
	}
			
}
