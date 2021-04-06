package Personnage.Classe;

import Personnage.Objets.ArmeCommune.Epee;
import Personnage.Objets.IObjets;

import java.util.Vector;

public class Rodeur extends AClasse{
    public Rodeur(){
        super();
        super.pointDeVie=8;
        super.arme = new Epee();
        super.inventaire.add(arme);
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public Vector<IObjets> getObjets() {
        return inventaire;
    }
    public String getClasse() {
        return "Rodeur";
    }
}
