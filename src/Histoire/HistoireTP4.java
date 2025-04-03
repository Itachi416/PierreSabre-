package Histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        Commercant Marco = new Commercant("Marco", 100);
        Yakuza YakuLeNoir= new Yakuza("Yaku Le Noir", "Warsong", 30);
        Ronin Roro=new Ronin("Roro","shochu",60);
        
        prof.direBonjour(); 
        prof.acheter("boisson", 12); 
        prof.boire(); 
        prof.acheter("jeu", 2); 
        prof.acheter("kimono", 50);
        
        Marco.direBonjour();
        Marco.seFaireExtorquer(100);
        Marco.recevoir(15);
        Marco.boire();
        
        YakuLeNoir.direBonjour();
        YakuLeNoir.extorquer(Marco);
        
        Roro.direBonjour();
        Roro.donner(Marco);
  
        
        
    }
}
