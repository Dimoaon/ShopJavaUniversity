package Produkty;

public class Fotografia extends Produkty {

	public Fotografia(String nazwaProduktu, float cenaProduktu, int liczbaProduktu, String opisProduktu) {
		super(nazwaProduktu, cenaProduktu, liczbaProduktu, opisProduktu);
	}

	public String toString() {
		return "Kategoria: fotografia" + super.toString();
	}

}
