package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron() {
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public int prendreLouche() {
		quantitePotion = quantitePotion - 1;

		if (quantitePotion == 0) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}