package osoba;


import adres.Adres;

public class Klient extends Osoba{
	

	private String promocjeKlienta;
	private String[] historiaZakupow;
	private String ranga;
	//ranga Nowy, Średniozaawansowany, Stały


	public Klient(String email, String haslo, String login, String nazwiskoImie, int wiek, Adres[] adres,
			double saldoKonta, String promocjeKlienta, String[] historiaZakupow, String ranga) {
		super(email, haslo, login, nazwiskoImie, wiek, adres, saldoKonta);
		this.promocjeKlienta = promocjeKlienta;
		this.historiaZakupow = historiaZakupow;
		this.ranga = ranga;
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
		return "Klient [promocjeKlienta=" + getPromocjeKlienta() 
				+ "]";
	}

	public void kup(int id)
	{

	}

	

}
