package strategiaGUI;

import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JFrame;

public class PracownikGUI extends OsobaZarzadzajacaGUI {
	// Konstruktor
	public PracownikGUI(JFrame frame1) {
		super(frame1);
	}
	
	@Override
	public void GUIcreate(JFrame frame1) {
		super.GUIcreate(frame1);
		try {
		    frame1.setIconImage(ImageIO.read(new File("Grafika/dolarNiebieski.png")));
		} catch (Exception e) {
		    System.err.println("Błąd podczas wczytywania ikony: " + e.getMessage());
		}
		
		// TODO wykorzystać wspólne menu dla osoby zarządzającej + dodać funkcje pracownika

	}
	
}
