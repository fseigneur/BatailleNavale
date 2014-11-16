package modele;

import java.util.Observable;

public class Case extends Observable {
	private boolean estTouche = false;
	private boolean estLibre;
	private int x;
	private int y;
	private Bateau bateau;

	public Case(int x, int y) {
		this.x = x;
		this.y = y;
		this.bateau = null;
	}

	public Case(int x, int y, Bateau bateau) {
		this.x = x;
		this.y = y;
		this.bateau = bateau;
	}

	public boolean estLibre() {
		if (this.bateau == null) {
			estLibre = true;
		}
		return estLibre;
	}

	public boolean estTouche() {
		return estTouche;
	}

	public void Touche() {
		if (!this.estLibre) {
			this.estTouche = true;
			this.bateau.subirDegat();
		} else if (this.estLibre) {
			this.estTouche = true;
		}
	}
}
