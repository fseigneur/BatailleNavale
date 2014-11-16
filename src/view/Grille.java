package view;

import javax.swing.*;
import java.awt.*;

public class Grille extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Champ de bataille");
		frame.setSize(350,350);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}