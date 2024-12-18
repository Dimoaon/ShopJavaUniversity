package Osoba;

import Adres.Adres;

public class Klient extends Osoba{
	
	private String promocjeKlienta;
	private String[] historiaZakupow;
	private String ranga;
	//ranga Nowy, Średniozaawansowany, Stały

	public Klient(String imieNazwisko, int wiek, Adres adres, String email, double saldoKonta,String promocjeKlienta,String[] historiaZakupow, String ranga) {
		super(imieNazwisko, wiek, adres, email, saldoKonta);
		this.promocjeKlienta=promocjeKlienta;
		this.historiaZakupow=historiaZakupow;
		this.ranga=ranga;
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

	public String ranga() { return ranga ;}

	public void setRanga(String ranga) {this.ranga = ranga;}
	
	public String toString() {
		return "Klient [promocjeKlienta=" + getPromocjeKlienta() + ", historiaZakupow=" + Arrays.toString(historiaZakupow)
				+ "]";
	}

	public void kup(int id)
	{

	}

	

}
