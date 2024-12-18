package Osoba;

import Adres.Adres;

public class OsobaZarzadzajaca extends Osoba{

    private String pesel;
    private float ocena;


    public OsobaZarzadzajaca(String imieNazwisko,int wiek,Adres[] adres,String email, String pesel, float ocena) {
        super(String imieNazwisko,int wiek,Adres[] adres,String email,String pesel, float ocena)
        this.pesel = pesel;
        this.ocena = ocena;
    }



    public String getPesel() {
        return pesel;
    }

    public float getOcena() {
        return ocena;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    abstract public void wyswietlProdukty()

    abstract public void wyswietlStanProduktu()

    abstract public void wyswietlStanKlienta()

    abstract public void wyswietlKlientow()

}