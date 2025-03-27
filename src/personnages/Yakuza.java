package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String clan, int argent) {
        super(nom, "whisky", argent);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
        int argentVole = victime.seFaireExtorquer(victime.getArgent());
        this.gagnerArgent(argentVole);
        this.reputation++; 
        parler("J'ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }
}
