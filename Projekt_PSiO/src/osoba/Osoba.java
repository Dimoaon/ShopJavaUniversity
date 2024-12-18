package Osoba;

import Adres.Adres;

public abstract class Osoba {
	private String email;
	private String haslo;
	
	private String NazwiskoImie;
	private int wiek;
	private Adres[] adres;

	private double saldoKonta;
	
	public Osoba(String imieNazwisko,int wiek,Adres[] adres,String email,double saldoKonta) {
		this.NazwiskoImie=imieNazwisko;
		this.wiek=wiek;
		this.adres=adres;
		this.email=email;
		this.saldoKonta=saldoKonta;
	}
	
	
	public String toString() {
		return "Klient: Nazwisko: " + NazwiskoImie +
				" adres: "+ String.join("; ", adres) +
				" email: " + email +
				" wiek: " + wiek +
				" saldo konta : " + saldoKonta;
	}
	
	
	public String getImieNazwisko() {
		return NazwiskoImie;
	}
	
	
	public void setNaziwskoImie(String NazwiskoImie) {
		this.NazwiskoImie = NazwiskoImie;
	}
	public int getWiek() {
		return wiek;
	}
	
	
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public double getSaldoKonta() {
		return saldoKonta;
	}
	
	
	public void setSaldoKonta(double saldoKonta) {
		this.saldoKonta = saldoKonta;
	}


	public String getHaslo() {
		return haslo;
	}


	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}


	public Adres[] getAdres() {
		return adres;
	}


	public void setAdres(Adres[] adres) {
		this.adres = adres;
	}
	
	

}
