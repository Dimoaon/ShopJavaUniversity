package strategiaGUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import logowanie.MenuLogowanie;
import adres.Adres;
import bibliotekaMetodIPol.Metody;
import bibliotekaMetodIPol.ZapisywanieObiektow;
import osoba.*;
import promocjaStrategia.PromocjaPodstawowa;
import zakupy.Zakupy;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Rejestracja implements GUIstrategia {

	private JFrame frame1;

	public Rejestracja(JFrame frame1) {
		this.frame1 = frame1;

		setupFrame();

		frame1.getContentPane().removeAll();
		GUIcreate(frame1);
		frame1.revalidate();
		frame1.repaint();
	}

	private void setupFrame() {
		frame1.setTitle("Rejestracja");
		frame1.setSize(350, 400);

		setFrameIcon("Grafika/key.png");
	}

	private void setFrameIcon(String iconPath) {
		try {
			frame1.setIconImage(ImageIO.read(new File(iconPath)));
		} catch (Exception e) {
			System.err.println("Błąd podczas wczytywania ikony: " + e.getMessage());
		}
	}

	@Override
	public void GUIcreate(JFrame frame1) {
		JPanel panel = new JPanel(new GridLayout(12, 1));

		panel.setBorder(new EmptyBorder(0, 10, 0, 10));

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

		JPanel panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(10, 10, 10, 10));

		JButton registerButton = new JButton("Zarejestruj");
		registerButton.addActionListener(
				e -> handleRegistration(emailField, hasloField, loginField, nazwiskoField, imieField, wiekField));
		panel1.add(registerButton);

		JButton backButton = new JButton("Powrót do logowania");
		backButton.addActionListener(e -> returnToLogin());
		panel1.add(backButton);

		frame1.getContentPane().add(BorderLayout.CENTER, panel);
		frame1.getContentPane().add(BorderLayout.SOUTH, panel1);
	}

	private void handleRegistration(JTextField emailField, JPasswordField hasloField, JTextField loginField,
			JTextField nazwiskoField, JTextField imieField, JTextField wiekField) {
		String email = emailField.getText().trim();
		String haslo = new String(hasloField.getPassword()).trim();
		String login = loginField.getText().trim();
		String nazwisko = nazwiskoField.getText().trim();
		String imie = imieField.getText().trim();
		String wiek = wiekField.getText().trim();

		if (isValidData(email, haslo, login, nazwisko, imie, wiek)) {
			Klient newClient = new Klient(email, haslo, login, nazwisko, imie, Integer.parseInt(wiek),
					new Adres("", "", "", "", "", ""), 0, new PromocjaPodstawowa(), new ArrayList<>(), new Zakupy());
			Metody.getListaKlientow().add(newClient);
			ZapisywanieObiektow.zapiszKlientow();

			JOptionPane.showMessageDialog(frame1, "Rejestracja zakończona sukcesem.", "Sukces",
					JOptionPane.INFORMATION_MESSAGE);

			Metody.setLoginAktywnejOsoby(login);
			Metody.setWybraneGUI(new KlientGUI(frame1));
		}

	}

	private boolean isValidData(String email, String haslo, String login, String nazwisko, String imie,
			String wiekStr) {
		if (email.isEmpty() || haslo.isEmpty() || login.isEmpty() || nazwisko.isEmpty() || imie.isEmpty()
				|| wiekStr.isEmpty()) {
			JOptionPane.showMessageDialog(frame1, "Wszystkie pola muszą być wypełnione!", "Błąd",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (!email.contains("@")) {
			JOptionPane.showMessageDialog(frame1, "Brak @ w emailu", "Błąd", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		boolean emailExists = true;
		boolean loginExists = true;

		if (MenuLogowanie.szukajIDEmailKlienta(email) == -1 && MenuLogowanie.szukajIDEmailZarzadzajacych(email) == -1)
			emailExists = false;

		if (MenuLogowanie.szukajIDLoginKlienta(login) == -1 && MenuLogowanie.szukajIDLoginZarzadzajacych(login) == -1)
			loginExists = false;

		if (emailExists && loginExists) {
			JOptionPane.showMessageDialog(frame1, "Konto z podanym emailem i loginem już istnieje!", "Błąd",
					JOptionPane.ERROR_MESSAGE);
			return false;
		} else if (emailExists) {
			JOptionPane.showMessageDialog(frame1, "Konto z podanym emailem już istnieje!", "Błąd",
					JOptionPane.ERROR_MESSAGE);
			return false;
		} else if (loginExists) {
			JOptionPane.showMessageDialog(frame1, "Konto z podanym loginem już istnieje!", "Błąd",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		String[] znakiSpecjalne = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")" };
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
			JOptionPane.showMessageDialog(frame1,
					"Hasło nie spełnia standardów bezpieczeństwa.\nPowinno mieć minimum: 8 znaków (w tym po 3 znaki małe i duże), 3 różne znaki specjalne",
					"Błąd", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (!isNumeric(wiekStr)) {
			JOptionPane.showMessageDialog(frame1, "Wiek musi być liczbą!", "Błąd", JOptionPane.ERROR_MESSAGE);
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

	private void returnToLogin() {
		Metody.setWybraneGUI(new LoginGUI(frame1));
	}

}
