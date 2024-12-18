package PreMetody;

import Osoby.*;
import Produkty.*;
import Arraylist;

public class MetodyPolaStatycznego{

    public static ArrayList<Klient> listaKlientow = new ArrayList<>();
    public static ArrayList<Pracownik> listaSprzedawcow = new ArrayList<>();
    public static ArrayList<Kierownik> listaKierownikow = new ArrayList<>();
    public static ArrayList<T> listaProduktow = new ArrayList<T>();

    public static void wczytajKlientow() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("BazaDanych/klienci.txt"))) {
            Object obj1 = is.readObject();
            kl = (Klient) obj1;
            listaKlientow.add(kl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void wczytajPracownikow() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("BazaDanych/pracownicy.txt"))) {
            Object obj1 = is.readObject();
            pr = (Pracownik) obj1;
            listaPracownikow.add(pr);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wczytajKierownikow() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("BazaDanych/kierownicy.txt"))) {
            Object obj1 = is.readObject();
            kier = (Kierownik) obj1;
            listaKierownikow.add(kier);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wczytajProdukty() {
        File bazaProdukty = new File("BazaDanych/produkty.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(bazaProdukty))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                String[] dane = linia.split(",");

                if dane[0] == "Kategoria: gaming"
                {
                    Gaming produkt = new Gaming(dane[1], Double.parseDouble(dane[2]), dane[3], Integer.parseInt(dane[4]));
                    listaProduktow.add(produkt);
                }

                else if dane[0] == "Kategoria: fotografia"
                {
                    Fotografia produkt = new Fotografia(dane[1], Double.parseDouble(dane[2]), dane[3], Integer.parseInt(dane[4]));
                    listaProduktow.add(produkt);
                }

                else
                {
                    Mieszane produkt = new Mieszane(dane[1], Double.parseDouble(dane[2]), dane[3], Integer.parseInt(dane[4]));
                    listaProduktow.add(produkt);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}