package Personnage.Classe;

import Personnage.Objets.ArmeCommune.Dague;
import Personnage.Objets.IObjets;

import java.util.Vector;

public class Barde extends AClasse {
    public Barde(){
        super();
        super.pointDeVie=8;
        super.arme = new Dague();
        super.inventaire.add(arme);
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public Vector<IObjets> getObjets() {
        return inventaire;
    }
    public String getClasse() {
        return "Barde";
    }
}
