package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	//attributi
	DecimalFormat df= new DecimalFormat("#.00");
	
	String marca,nome;
	double prezzoBase;
	int iva;
	
	
	//costruttori
	public Prodotto() {}
	
	public Prodotto(String marca, String nome, double prezzo, int iva) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzo;
		this.iva = iva;
		
		
	
		}
	//metodi
			 double prezzoTotale() {
				return prezzoBase + ((prezzoBase / 100) * iva);
	}
			String descrizioneFinale() {
				return "il prezzo del prodotto: " +nome+ "  di marca: " +marca+ "  è:  " + df.format(prezzoTotale());                       
			}
			
}
