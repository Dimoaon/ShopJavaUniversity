package osoba;

import adres.Adres;

public class Pracownik extends OsobaZarzadzajaca {

	private static final long serialVersionUID = 1L;

	// Konstruktor
	public Pracownik(String email, String haslo, String login, String nazwisko, String imie, int wiek, Adres adres,
			double saldoKonta, String pesel) {
		super(email, haslo, login, nazwisko, imie, wiek, adres, saldoKonta, pesel);
	}

	// Inne metody
	@Override
	public String toString() {
		return "Pracownik [" + super.toString() + "]";
	}

}
