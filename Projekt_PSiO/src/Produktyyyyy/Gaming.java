package Produkty;

public class Gaming extends Produkty {

	public Gaming(String nazwaProduktu, float cenaProduktu, int liczbaProduktu, String opisProduktu) {
		super(nazwaProduktu, cenaProduktu, liczbaProduktu, opisProduktu);
	}

	public String toString() {
		return "Kategoria: gaming" + super.toString();
	}

}
