package zakupy;

import java.util.ArrayList;
import produkty.Produkty;
import java.io.Serializable;

public class Zakupy implements Serializable {

	private static final long serialVersionUID = 1L;

	// Składowe kłasy
	private ArrayList<Produkty> listaProduktow;
	private double cenaDoZaplaty;

	// Konstruktor 1
	public Zakupy() {
		this.listaProduktow = new ArrayList<>();
		this.cenaDoZaplaty = 0.0;
	}

	// Konstruktor 2
	public Zakupy(ArrayList<Produkty> listaProduktow, double cenaDoZaplaty) {
		this.listaProduktow = listaProduktow;
		this.cenaDoZaplaty = cenaDoZaplaty;
	}

	public double obliczCene() {
		double cena = 0;

		for (Produkty produkt : listaProduktow) {
			cena += produkt.getCenaProduktu();
		}

		return cena;
	}

	// Getters and Setters
	public ArrayList<Produkty> getListaProduktow() {
		return listaProduktow;
	}

	public void setListaProduktow(ArrayList<Produkty> listaProduktow) {
		this.listaProduktow = listaProduktow;
	}

	public double getCenaDoZaplaty() {
		return cenaDoZaplaty;
	}

	public void setCenaDoZaplaty(double cenaDoZaplaty) {
		this.cenaDoZaplaty = cenaDoZaplaty;
	}

}
