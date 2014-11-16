package modele;

import java.util.ArrayList;

public class Grille {
	private ArrayList<Case> listeCase;
	private int Longueur;
	private int Largeur;

	public Grille(int Longueur, int Largeur) {
		this.setLongueur(Longueur);
		this.setLargeur(Largeur);
		int i;
		int o;
		for (i = 1; i < Option.getMaxX(); i++) {
			for (o = 1; i < Option.getMaxY(); i++) {
				listeCase.add(new Case(i, o));
			}
		}
	}

	public int getLargeur() {
		return Largeur;
	}

	public void setLargeur(int largeur) {
		Largeur = largeur;
	}

	public int getLongueur() {
		return Longueur;
	}

	public void setLongueur(int longueur) {
		Longueur = longueur;
	}
}
