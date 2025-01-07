package main;

import bibliotekaMetodIPol.*;
import inneGUI.*;
import osoba.*;
import produkty.*;

public class Main {

	public static void main(String[] args) {
		start();

	}

	private static void start() {
		WczytywanieObiektow.wczytajDane();

		// Pierwsze konto w sklepie, jeśli jeszcze nie było (admin)
		if (Metody.getListaOsobZarzadzajacych().isEmpty())
			Metody.getListaOsobZarzadzajacych()
					.add(new Kierownik("admin@gmail.com", "admin", "admin", "Nazwisko", "Imie", 18, null, 0, ""));

		//testoweDane();
		
		@SuppressWarnings("unused")
		GUImain oknoGlowne = new GUImain();
	}

	private static void testoweDane() {
		// Osoby
		Metody.getListaKlientow()
				.add(new Klient("b@gmail.com", "ananas", "aaa", "Nazwisko", "Imie", 18, null, 0, null, null));
		Metody.getListaOsobZarzadzajacych().add(new Pracownik("ccc@gmail.com", "aaaaaa", "bbbbbb", "Nazwiskooooo",
				"Imieeeee", 22, null, 200.0, "423432324324"));
		Metody.getListaOsobZarzadzajacych().add(new Pracownik("ccc@gmail.com", "aaaaaa", "bbbbbb", "Nazwiskooooo",
				"Imieeeee", 22, null, 200.0, "423432324324"));
		Metody.getListaOsobZarzadzajacych().add(new Pracownik("ccc@gmail.com", "aaaaaa", "bbbbbb", "Nazwiskooooo",
				"Imieeeee", 22, null, 200.0, "423432324324"));
		Metody.getListaOsobZarzadzajacych().add(new Pracownik("ccc@gmail.com", "aaaaaa", "bbbbbb", "Nazwiskooooo",
				"Imieeeee", 22, null, 200.0, "423432324324"));
		Metody.getListaOsobZarzadzajacych().add(new Pracownik("ccc@gmail.com", "aaaaaa", "bbbbbb", "Nazwiskooooo",
				"Imieeeee", 22, null, 200.0, "423432324324"));

		// Produkty
		Metody.getListaProduktow().add(new Gaming("PS5", 3000, 7, null));
		Metody.getListaProduktow().add(new Gaming("PS4", 2000, 4, null));
		Metody.getListaProduktow().add(new Gaming("Nintendo Switch", 1500, 3, null));
		Metody.getListaProduktow().add(new Fotografia("Lustrzanka Canon", 1700, 2, null));
		Metody.getListaProduktow().add(new Fotografia("Papier fotograficzny", 85, 22, null));
		Metody.getListaProduktow().add(new Fotografia("Karta pamięci sd 64gb", 80, 20, null));
		Metody.getListaProduktow().add(new Mieszane("Gamingowa drukarka HP", 800, 7, null));
		Metody.getListaProduktow().add(new Mieszane("Aparat w stylu Naruto", 1400, 5, null));
		Metody.getListaProduktow().add(new Mieszane("Etui do aparatu Hideokojima Edition", 500, 2, null));
		Metody.getListaProduktow().add(new Gaming("PS5", 3000, 7, null));
		Metody.getListaProduktow().add(new Gaming("PS4", 2000, 4, null));
		Metody.getListaProduktow().add(new Gaming("Nintendo Switch", 1500, 3, null));
		Metody.getListaProduktow().add(new Fotografia("Lustrzanka Canon", 1700, 2, null));
		Metody.getListaProduktow().add(new Fotografia("Papier fotograficzny", 85, 22, null));
		Metody.getListaProduktow().add(new Fotografia("Karta pamięci sd 64gb", 80, 20, null));
		Metody.getListaProduktow().add(new Mieszane("Gamingowa drukarka HP", 800, 7, null));
		Metody.getListaProduktow().add(new Mieszane("Aparat w stylu Naruto", 1400, 5, null));
		Metody.getListaProduktow().add(new Mieszane("Etui do aparatu Hideokojima Edition", 500, 2, null));
		Metody.getListaProduktow().add(new Gaming("PS5", 3000, 7, null));
		Metody.getListaProduktow().add(new Gaming("PS4", 2000, 4, null));
		Metody.getListaProduktow().add(new Gaming("Nintendo Switch", 1500, 3, null));
		Metody.getListaProduktow().add(new Fotografia("Lustrzanka Canon", 1700, 2, null));
		Metody.getListaProduktow().add(new Fotografia("Papier fotograficzny", 85, 22, null));
		Metody.getListaProduktow().add(new Fotografia("Karta pamięci sd 64gb", 80, 20, null));
		Metody.getListaProduktow().add(new Mieszane("Gamingowa drukarka HP", 800, 7, null));
		Metody.getListaProduktow().add(new Mieszane("Aparat w stylu Naruto", 1400, 5, null));
		Metody.getListaProduktow().add(new Mieszane("Etui do aparatu Hideokojima Edition", 500, 2, null));
		Metody.getListaProduktow().add(new Gaming("PS5", 3000, 7, null));
		Metody.getListaProduktow().add(new Gaming("PS4", 2000, 4, null));
		Metody.getListaProduktow().add(new Gaming("Nintendo Switch", 1500, 3, null));
		Metody.getListaProduktow().add(new Fotografia("Lustrzanka Canon", 1700, 2, null));
		Metody.getListaProduktow().add(new Fotografia("Papier fotograficzny", 85, 22, null));
		Metody.getListaProduktow().add(new Fotografia("Karta pamięci sd 64gb", 80, 20, null));
		Metody.getListaProduktow().add(new Mieszane("Gamingowa drukarka HP", 800, 7, null));
		Metody.getListaProduktow().add(new Mieszane("Aparat w stylu Naruto", 1400, 5, null));
		Metody.getListaProduktow().add(new Mieszane("Etui do aparatu Hideokojima Edition", 500, 2, null));
		Metody.getListaProduktow().add(new Gaming("PS5", 3000, 7, null));
		Metody.getListaProduktow().add(new Gaming("PS4", 2000, 4, null));
		Metody.getListaProduktow().add(new Gaming("Nintendo Switch", 1500, 3, null));
		Metody.getListaProduktow().add(new Fotografia("Lustrzanka Canon", 1700, 2, null));
		Metody.getListaProduktow().add(new Fotografia("Papier fotograficzny", 85, 22, null));
		Metody.getListaProduktow().add(new Fotografia("Karta pamięci sd 64gb", 80, 20, null));
		Metody.getListaProduktow().add(new Mieszane("Gamingowa drukarka HP", 800, 7, null));
		Metody.getListaProduktow().add(new Mieszane("Aparat w stylu Naruto", 1400, 5, null));
		Metody.getListaProduktow().add(new Mieszane("Etui do aparatu Hideokojima Edition", 500, 2, null));
		Metody.getListaProduktow().add(new Gaming("PS5", 3000, 7, null));
		Metody.getListaProduktow().add(new Gaming("PS4", 2000, 4, null));
		Metody.getListaProduktow().add(new Gaming("Nintendo Switch", 1500, 3, null));
		Metody.getListaProduktow().add(new Fotografia("Lustrzanka Canon", 1700, 2, null));
		Metody.getListaProduktow().add(new Fotografia("Papier fotograficzny", 85, 22, null));
		Metody.getListaProduktow().add(new Fotografia("Karta pamięci sd 64gb", 80, 20, null));
		Metody.getListaProduktow().add(new Mieszane("Gamingowa drukarka HP", 800, 7, null));
		Metody.getListaProduktow().add(new Mieszane("Aparat w stylu Naruto", 1400, 5, null));
		Metody.getListaProduktow().add(new Mieszane("Etui do aparatu Hideokojima Edition", 500, 2, null));

	}

}
