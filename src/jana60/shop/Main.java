package jana60.shop;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) 
	{
		Prodotto[] prodotti= new Prodotto[2];
		
		Prodotto attaccaPanni = new Prodotto("attack", "attaccaPanni",4.99, 23);
		Prodotto schiuma = new Prodotto("skum", "schiuma",5.69, 40);
		
		prodotti [0] = attaccaPanni;
		prodotti [1] = schiuma;
		
		for (int i= 0; i<prodotti.length; i++) 
		{
			System.out.println(prodotti[i].descrizioneFinale());
		}
	}

}
