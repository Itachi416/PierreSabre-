package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    protected void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public String getNom() {
        return nom;
    }

    protected int getArgent() {
        return argent;
    }

    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'acheter un " + bien + " � " + prix + " sous.");
            perdreArgent(prix);
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'acheter un " + bien + " � " + prix + " sous.");
        }
 
    }


    protected void perdreArgent(int perte) {
        argent -= perte;
    }
    
    protected void gagnerArgent(int gain) {
    	argent += gain;
    }
   }



