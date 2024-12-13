import Adres.*;
import Logowanie.*;
import Osoba.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("  ______   __    __  __        ________  _______                                          \n" +
                    " /      \\ |  \\  /  \\|  \\      |        \\|       \\                                         \n" +
                    "|  $$$$$$\\| $$ /  $$| $$      | $$$$$$$$| $$$$$$$\\                                        \n" +
                    "| $$___\\$$| $$/  $$ | $$      | $$__    | $$__/ $$                                        \n" +
                    " \\$$    \\ | $$  $$  | $$      | $$  \\   | $$    $$                                        \n" +
                    " _\\$$$$$$\\| $$$$$\\  | $$      | $$$$$   | $$$$$$$                                         \n" +
                    "|  \\__| $$| $$ \\$$\\ | $$_____ | $$_____ | $$                                              \n" +
                    " \\$$    $$| $$  \\$$\\| $$     \\| $$     \\| $$                                              \n" +
                    "  \\$$$$$$  \\$$   \\$$ \\$$$$$$$$ \\$$$$$$$$ \\$$                                              \n" +
                    "                                                                                          \n" +
                    "                                                                                          \n" +
                    "                                                                                          \n" +
                    "  ______   __        __        ________  _______   _______    ______    ______    ______  \n" +
                    " /      \\ |  \\      |  \\      |        \\|       \\ |       \\  /      \\  /      \\  /      \\ \n" +
                    "|  $$$$$$\\| $$      | $$      | $$$$$$$$| $$$$$$$\\| $$$$$$$\\|  $$$$$$\\|  $$$$$$\\|  $$$$$$\\\n" +
                    "| $$__| $$| $$      | $$      | $$__    | $$  | $$| $$__| $$| $$  | $$| $$ __\\$$| $$  | $$\n" +
                    "| $$    $$| $$      | $$      | $$  \\   | $$  | $$| $$    $$| $$  | $$| $$|    \\| $$  | $$\n" +
                    "| $$$$$$$$| $$      | $$      | $$$$$   | $$  | $$| $$$$$$$\\| $$  | $$| $$ \\$$$$| $$  | $$\n" +
                    "| $$  | $$| $$_____ | $$_____ | $$_____ | $$__/ $$| $$  | $$| $$__/ $$| $$__| $$| $$__/ $$\n" +
                    "| $$  | $$| $$     \\| $$     \\| $$     \\| $$    $$| $$  | $$ \\$$    $$ \\$$    $$ \\$$    $$\n" +
                    " \\$$   \\$$ \\$$$$$$$$ \\$$$$$$$$ \\$$$$$$$$ \\$$$$$$$  \\$$   \\$$  \\$$$$$$   \\$$$$$$   \\$$$$$$ \n" +
                    "                                                                                          \n" +
                    "                                                                                          \n" +
                    "                                                                                          ");
            System.out.println("\nMenu logowania do sklepu");
            System.out.println("1. Zaloguj sie (klient).");
            System.out.println("2. Zaloguj sie (sprzedawca).");
            System.out.println("3. Zaloguj sie (pracownik).");
            System.out.println("4. Przeglądaj produkty.");
            System.out.println("5. Wyszukaj dany produkt.");
            System.out.println("6. Wyszukaj danego sprzedawcę.");
            System.out.println("7. Wyswietl wszystkich uzytkownikow sklepu.");
            System.out.println("8. Wyjscie ze sklepu\n");

            System.out.print("Wybierz opcję: ");
            int wybor = input.nextInt();

            switch (wybor) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    return;

                case 8:
                    exit();

                default:
                    System.out.println("Wybrano złą opcję. Spróbuj ponownie");


            }
    }
}

