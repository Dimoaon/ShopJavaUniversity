package Osoba;

import java.util.Arrays;

import Adres.Adres;

public class Klient extends Osoba{
	
	String promocjeKlienta;
	String[] historiaZakupow;

	public Klient(String imieNazwisko, int wiek, Adres adres, String email, double saldoKonta,String promocjeKlienta,String[] historiaZakupow) {
		super(imieNazwisko, wiek, adres, email, saldoKonta);
		this.promocjeKlienta=promocjeKlienta;
		this.historiaZakupow=historiaZakupow;
	}


	public String getPromocjeKlienta() {
		return promocjeKlienta;
	}

	public void setPromocjeKlienta(String promocjeKlienta) {
		this.promocjeKlienta = promocjeKlienta;
	}

	public String[] getHistoriaZakupow() {
		return historiaZakupow;
	}

	public void setHistoriaZakupow(String[] historiaZakupow) {
		this.historiaZakupow = historiaZakupow;
	}
	
	
	public String toString() {
		return "Klient [promocjeKlienta=" + getPromocjeKlienta() + ", historiaZakupow=" + Arrays.toString(historiaZakupow)
				+ "]";
	}

	

}
