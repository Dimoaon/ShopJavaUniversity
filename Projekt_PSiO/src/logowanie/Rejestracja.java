package logowanie;

import javax.imageio.ImageIO;
import javax.swing.*;

import bibliotekaMetodIPol.Metody;
import bibliotekaMetodIPol.ZapisywanieObiektow;
import osoba.Klient;
import strategiaGUI.LoginGUI;
import zakupy.Zakupy;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import osoba.Klient;
import bibliotekaMetodIPol.Metody;

public class Rejestracja {

    public static void uruchomRejetracje(JFrame frame1) {
    	frame1.setTitle("Rejestracja");
    	frame1.setSize(400, 200);
    	
    	try {
		    frame1.setIconImage(ImageIO.read(new File("Grafika/key.png")));
		} catch (Exception e) {
		    System.err.println("Błąd podczas wczytywania ikony: " + e.getMessage());
		}
    	
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        
        JLabel labelEmail = new JLabel("Email:");
        JTextField emailField = new JTextField(0);
        JLabel labelHaslo = new JLabel("Hasło:");
        JPasswordField hasloField = new JPasswordField(20);
        JLabel labelLogin = new JLabel("Login:");
        JTextField loginField = new JTextField(20);
        JLabel labelNazwisko = new JLabel("Nazwisko:");
        JTextField nazwiskoField = new JTextField(20);
        JLabel labelImie = new JLabel("Imię:");
        JTextField imieField = new JTextField(20);
        JLabel labelWiek = new JLabel("Wiek:");
        JTextField wiekField = new JTextField(20);
        
        JButton registerButton = new JButton("Zarejestruj");
        JButton backButton = new JButton("Powrót do logowania");

        panel.add(labelEmail);
        panel.add(emailField);
        panel.add(labelHaslo);
        panel.add(hasloField);
        panel.add(labelLogin);
        panel.add(loginField);
        panel.add(labelNazwisko);
        panel.add(nazwiskoField);
        panel.add(labelImie);
        panel.add(imieField);
        panel.add(labelWiek);
        panel.add(wiekField);
        panel.add(registerButton);
        panel.add(backButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	rejestracja(frame1, emailField, hasloField, loginField, nazwiskoField, imieField, wiekField);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.getContentPane().removeAll();
                
                try {
        		    frame1.setIconImage(ImageIO.read(new File("Grafika/login.jpg")));
        		} catch (Exception e1) {
        		    System.err.println("Błąd podczas wczytywania ikony: " + e1.getMessage());
        		}
                
                new LoginGUI(frame1); 
                frame1.revalidate();
                frame1.repaint();
            }
        });

        frame1.getContentPane().removeAll();
        frame1.getContentPane().add(panel);
        frame1.revalidate();
        frame1.repaint();
    }
    
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public static void rejestracja(JFrame frame1, JTextField emailField, JPasswordField hasloField, JTextField loginField, 
            JTextField nazwiskoField, JTextField imieField, JTextField wiekField) {
    			String email = emailField.getText().trim();
    			String haslo = new String(hasloField.getPassword()).trim();
    			String login = loginField.getText().trim();
    			String nazwisko = nazwiskoField.getText().trim();
    			String imie = imieField.getText().trim();
    			String wiekStr = wiekField.getText().trim();

    			
    			if (email.isEmpty() || haslo.isEmpty() || login.isEmpty() || nazwisko.isEmpty() || imie.isEmpty() || wiekStr.isEmpty()) {
    				JOptionPane.showMessageDialog(frame1, "Wszystkie pola muszą być wypełnione!", "Błąd", JOptionPane.ERROR_MESSAGE);
    				return;
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

    			String[] znakiSpecjalne = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
    			int liczbaSpecjalnych = 0;
    			int liczbaZnakow = haslo.length();
    			int liczbaMalychZnakow = 0;
    			int liczbaDuzychZnakow = 0;

    			int wiek;

    			// Sprawdzenie liczby znaków specjalnych w haśle
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




    			if (!(email.contains("@"))) {
    				JOptionPane.showMessageDialog(frame1, "Brak @ w emailu", "Błąd", JOptionPane.ERROR_MESSAGE);
    				return;
    			}


    			if (liczbaZnakow < 8 || liczbaMalychZnakow < 3 || liczbaDuzychZnakow < 3 || liczbaSpecjalnych < 3) {
    				JOptionPane.showMessageDialog(frame1,"Hasło nie spełnia standardów bezpieczeństwa.\nPowinno mieć minimum: 8 znaków (w tym po 3 znaki małe i duże), 3 różne znaki specjalne", "Błąd", JOptionPane.ERROR_MESSAGE);
    				return;
    			}


    			if (!isNumeric(wiekStr)) {
    				JOptionPane.showMessageDialog(frame1, "Wiek musi być liczbą!", "Błąd", JOptionPane.ERROR_MESSAGE);
    				return;
    			}
    			wiek = Integer.parseInt(wiekStr);


    			if (emailExists && loginExists) {
    				JOptionPane.showMessageDialog(frame1, "Konto z podanym emailem i loginem już istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
    			} else if (emailExists) {
    				JOptionPane.showMessageDialog(frame1, "Konto z podanym emailem już istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
    			} else if (loginExists) {
    				JOptionPane.showMessageDialog(frame1, "Konto z podanym loginem już istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
    			} else {
    				Klient nowyKlient = new Klient(email, haslo, login, nazwisko, imie, wiek, null, 0, null, null, null);
    				Metody.getListaKlientow().add(nowyKlient);
    				ZapisywanieObiektow.zapiszKlientow();
    				JOptionPane.showMessageDialog(frame1, "Rejestracja zakończona sukcesem!", "Informacja", JOptionPane.INFORMATION_MESSAGE);
    			}
    }
    
}
