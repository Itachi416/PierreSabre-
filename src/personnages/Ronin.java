package personnages;

public class Ronin extends Humain {
	private int honneur ;
	
	public Ronin (String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.honneur=1;
}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = getArgent()/10;
		parler(beneficiaire.getNom()+ " prend ces " + argentDonne + " sous.");
		perdreArgent(argentDonne);
		beneficiaire.gagnerArgent(argentDonne);
		beneficiaire.recevoir(argentDonne);
		honneur+=1;
	}

}

