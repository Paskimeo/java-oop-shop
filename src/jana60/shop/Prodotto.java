package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	//attributi
	DecimalFormat df= new DecimalFormat("#.00");
	
	String marca,nome;
	float prezzoBase;
	int iva;
	
	
	//costruttori
	public Prodotto() {}
	
	public Prodotto(String marca, String nome, float prezzo, int iva) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzo;
		this.iva = iva;
		
		
	
		}
	//metodi
			 float prezzoTotale() {
				return prezzoBase + ((prezzoBase / 100) * iva);
	}
			String descrizioneFinale( ) {
				return "il prezzo del prodotto è: " +nome+ "di marca:" +marca+ "è:" + df.format(prezzoTotale());                       
			}
			
}
