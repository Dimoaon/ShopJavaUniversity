package Produkty;

public class Mieszane extends Produkty {

	public Mieszane(String nazwaProduktu, float cenaProduktu, int liczbaProduktu, String opisProduktu) {
		super(nazwaProduktu, cenaProduktu, liczbaProduktu, opisProduktu);
	}

	public String toString() {
		return "Kategoria: mieszane" + super.toString();
	}

}
