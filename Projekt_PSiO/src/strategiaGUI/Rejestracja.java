package strategiaGUI;

import javax.imageio.ImageIO;
import javax.swing.*;

import adres.Adres;
import bibliotekaMetodIPol.Metody;
import bibliotekaMetodIPol.ZapisywanieObiektow;
import osoba.Klient;
import promocjaStrategia.PromocjaPodstawowa;
import strategiaGUI.LoginGUI;
import zakupy.Zakupy;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Rejestracja {

    public Rejestracja(JFrame frame1) {
        setupFrame(frame1);
        createRegistrationPanel(frame1);
    }

    private void setupFrame(JFrame frame1) {
        frame1.setTitle("Rejestracja");
        frame1.setSize(400, 200);
        setFrameIcon(frame1, "Grafika/key.png");
    }

    private void setFrameIcon(JFrame frame, String iconPath) {
        try {
            frame.setIconImage(ImageIO.read(new File(iconPath)));
        } catch (Exception e) {
            System.err.println("Błąd podczas wczytywania ikony: " + e.getMessage());
        }
    }

    private void createRegistrationPanel(JFrame frame1) {
        JPanel panel = new JPanel(new GridLayout(7, 2));

        JTextField emailField = new JTextField();
        JPasswordField hasloField = new JPasswordField();
        JTextField loginField = new JTextField();
        JTextField nazwiskoField = new JTextField();
        JTextField imieField = new JTextField();
        JTextField wiekField = new JTextField();

        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Hasło:"));
        panel.add(hasloField);
        panel.add(new JLabel("Login:"));
        panel.add(loginField);
        panel.add(new JLabel("Nazwisko:"));
        panel.add(nazwiskoField);
        panel.add(new JLabel("Imię:"));
        panel.add(imieField);
        panel.add(new JLabel("Wiek:"));
        panel.add(wiekField);

        JButton registerButton = new JButton("Zarejestruj");
        registerButton.addActionListener(e -> handleRegistration(frame1, emailField, hasloField, loginField, nazwiskoField, imieField, wiekField));
        panel.add(registerButton);

        JButton backButton = new JButton("Powrót do logowania");
        backButton.addActionListener(e -> returnToLogin(frame1));
        panel.add(backButton);

        frame1.getContentPane().removeAll();
        frame1.getContentPane().add(panel);
        frame1.revalidate();
        frame1.repaint();
    }

    private void handleRegistration(JFrame frame1, JTextField emailField, JPasswordField hasloField, JTextField loginField,
                                    JTextField nazwiskoField, JTextField imieField, JTextField wiekField) {
        String email = emailField.getText().trim();
        String haslo = new String(hasloField.getPassword()).trim();
        String login = loginField.getText().trim();
        String nazwisko = nazwiskoField.getText().trim();
        String imie = imieField.getText().trim();
        String wiek = wiekField.getText().trim();

        isValidData(email, haslo, login, nazwisko, imie, wiek);

        Klient newClient = new Klient(email, haslo, login, nazwisko, imie, Integer.parseInt(wiek), 
                                      new Adres("", "", "", null, null, null), 0, new PromocjaPodstawowa(), 
                                      new ArrayList<>(), new Zakupy());
        Metody.getListaKlientow().add(newClient);
        ZapisywanieObiektow.zapiszKlientow();
        
        JOptionPane.showMessageDialog(frame1, "Rejestracja zakończona sukcesem.", "Sukces", JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean isValidData(String email, String haslo, String login, String nazwisko, String imie, String wiekStr) {
        if (email.isEmpty() || haslo.isEmpty() || login.isEmpty() || nazwisko.isEmpty() || imie.isEmpty() || wiekStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wszystkie pola muszą być wypełnione!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(null, "Brak @ w emailu", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        boolean emailExists = false;
        boolean loginExists = false;
        for (Klient klient : Metody.getListaKlientow()) {
            if (klient.getEmail().equals(email)) {
                emailExists = true;
            }
            if (klient.getLogin().equals(login)) {
                loginExists = true;
            }
        }

        if (emailExists && loginExists) {
            JOptionPane.showMessageDialog(null, "Konto z podanym emailem i loginem już istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (emailExists) {
            JOptionPane.showMessageDialog(null, "Konto z podanym emailem już istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (loginExists) {
            JOptionPane.showMessageDialog(null, "Konto z podanym loginem już istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String[] znakiSpecjalne = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        int liczbaSpecjalnych = 0;
        int liczbaZnakow = haslo.length();
        int liczbaMalychZnakow = 0;
        int liczbaDuzychZnakow = 0;

        for (String znak : znakiSpecjalne) {
            if (haslo.contains(znak)) {
                liczbaSpecjalnych++;
            }
        }

        for (int i = 0; i < haslo.length(); i++) {
            char znak = haslo.charAt(i);
            if (Character.isLowerCase(znak)) {
                liczbaMalychZnakow++;
            } else if (Character.isUpperCase(znak)) {
                liczbaDuzychZnakow++;
            }
        }

        if (liczbaZnakow < 8 || liczbaMalychZnakow < 3 || liczbaDuzychZnakow < 3 || liczbaSpecjalnych < 3) {
            JOptionPane.showMessageDialog(null, "Hasło nie spełnia standardów bezpieczeństwa.\nPowinno mieć minimum: 8 znaków (w tym po 3 znaki małe i duże), 3 różne znaki specjalne", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!isNumeric(wiekStr)) {
            JOptionPane.showMessageDialog(null, "Wiek musi być liczbą!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void returnToLogin(JFrame frame1) {
        frame1.getContentPane().removeAll();
        setFrameIcon(frame1, "Grafika/login.jpg");
        new LoginGUI(frame1);
        frame1.revalidate();
        frame1.repaint();
    }
}
