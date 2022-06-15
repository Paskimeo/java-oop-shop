package jana60.shop;

public class Prodotto {

	//attributi
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
			public float prezzoTotale() {
				return prezzoBase + ((prezzoBase / 100) * iva);
	}
}
