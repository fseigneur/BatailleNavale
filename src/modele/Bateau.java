package modele;

public class Bateau {
	private String Nom;
	// Etat = false dead || Etat = true vivant
	private boolean Etat;
	private int Vie;
	private int Taille;

	public Bateau(String Nom, int taille) {
		this.setTaille(taille);
		this.Vie = taille;
		this.Etat = true;
	}

	public void subirDegat() {
		if (this.Etat) {
			this.Vie--;
			if (this.Vie <= 0) {
				this.Etat = false;
			}
		}
	}

	public int getTaille() {
		return Taille;
	}

	public void setTaille(int taille) {
		Taille = taille;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}
}