package Personnage.Classe;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.ArmeCommune.Epee;
import Personnage.Objets.IArme;
import Personnage.Objets.IObjets;

import java.util.List;
import java.util.Vector;

public class Barbare extends AClasse{

    public Barbare(){
        super();
        super.pointDeVie=12;
        super.arme= (IArme) new Epee();
        super.inventaire.add(arme);
    }
    public int getPointDeVie(){
        return pointDeVie;
    }
    public Vector<IObjets> getObjets(){
        return inventaire;
    }

    public String getClasse() {
        return "Barbare";
    }
}