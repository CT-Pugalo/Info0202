package Personnage.Classe;

import Personnage.Objets.IObjets;

import java.util.Vector;

public abstract class AClasse implements IClasse{

    protected int pointDeVie;
    protected IObjets arme;
    protected Vector<IObjets> inventaire = new Vector<IObjets>();

    public abstract int getPointDeVie();
    public abstract Vector<IObjets> getObjets();
    public abstract String getClasse();

}