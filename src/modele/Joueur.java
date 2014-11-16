package modele;

import java.util.ArrayList;

public class Joueur {

	public String nom;
	private Grille grille;
	private Grille grilleEnnemi;
	private ArrayList<Bateau> listeBateau;

	public Joueur(String nom) {
		this.nom = nom;
		this.setGrille(new Grille(Option.getMaxY(), Option.getMaxX()));
		this.setGrilleEnnemi(new Grille(Option.getMaxY(), Option.getMaxX()));
	}

	public void placer(Bateau b) {
		this.listeBateau.add(b);
	}

	public Grille getGrilleEnnemi() {
		return grilleEnnemi;
	}

	public void setGrilleEnnemi(Grille grilleEnnemi) {
		this.grilleEnnemi = grilleEnnemi;
	}

	public Grille getGrille() {
		return grille;
	}

	public void setGrille(Grille grille) {
		this.grille = grille;
	}
}
