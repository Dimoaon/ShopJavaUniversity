import Adres.*;
import Logowanie.*;
import Osoba.*;

import Scanner.*;

public class Sklep
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("  _____________  __.____     _____________________ \n" +
                    " /   _____/    |/ _|    |    \\_   _____/\\______   \\\n" +
                    " \\_____  \\|      < |    |     |    __)_  |     ___/\n" +
                    " /        \\    |  \\|    |___  |        \\ |    |    \n" +
                    "/_______  /____|__ \\_______ \\/_______  / |____|    \n" +
                    "        \\/        \\/       \\/        \\/            ");

            System.out.println("\nMenu logowania do sklepu");
            System.out.println("1. Dodaj transakcje");
            System.out.println("2. Wyświetl transakcje");
            System.out.println("3. Dodaj pojedynczą transakcję");
            System.out.println("4. Policz transakcje z Kartą Seniora");
            System.out.println("5. Znajdź klienta ze Studencką Kartą z najwyższą transakcją");
            System.out.println("6. Zapisz transakcje studentów do pliku");
            System.out.println("0. Wyjście");

            System.out.print("Wybierz opcję: ");
            int wybor = input.nextInt();

        }
}

