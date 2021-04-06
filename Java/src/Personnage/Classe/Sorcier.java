package Personnage.Classe;

import Personnage.Objets.ArmeCommune.Baton;
import Personnage.Objets.IObjets;

import java.util.Vector;

public class Sorcier extends AClasse{
    public Sorcier(){
        super();
        super.pointDeVie=8;
        super.arme = new Baton();
        super.inventaire.add(arme);
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public Vector<IObjets> getObjets() {
        return inventaire;
    }

    public String getClasse() {
        return "Sorcier";
    }
}
