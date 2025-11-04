package personnages;

import java.util.Iterator;

public class Village {
	int NB_VILLAGEOIS_MAX;
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	
	public Village(String nom, Gaulois chef, int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.NB_VILLAGEOIS_MAX = NB_VILLAGEOIS_MAX;
		this.chef = chef;
		chef.setVillage(this);
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < NB_VILLAGEOIS_MAX) {
		
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		}
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (0 < numVillageois && numVillageois <= nbVillageois) {
			Gaulois g = villageois[numVillageois - 1];
			return g;
		} else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
	
	public void afficherVillage() {
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois gaulois = villageois[i];
			System.out.println(gaulois);
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);

		System.out.println(gaulois);
		
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		
		village.afficherVillageois();
		
		Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);
		
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
		
		
		
	}
	
}
