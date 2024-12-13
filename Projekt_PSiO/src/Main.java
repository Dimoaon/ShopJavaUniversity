import Adres.*;
import Logowanie.*;
import Osoba.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
}

