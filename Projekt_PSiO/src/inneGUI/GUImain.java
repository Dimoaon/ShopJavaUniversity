package inneGUI;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import bibliotekaMetodIPol.*;
import strategiaGUI.*;

public class GUImain {

	// Składowe kłasy
	private JFrame frame1;

	// Konstruktor
	public GUImain() {
		frame1 = new JFrame();

		try {
		    frame1.setIconImage(ImageIO.read(new File("Grafika/login.jpg")));
		} catch (Exception e) {
		    System.err.println("Błąd podczas wczytywania ikony: " + e.getMessage());
		}
		
		Metody.setWybraneGUI(new LoginGUI(frame1));
		wspolneDlaGUI();
	}

	// Metody
	private void wspolneDlaGUI() {
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setVisible(true);
	}
}
