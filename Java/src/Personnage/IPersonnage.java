package Personnage;

import Personnage.Objets.IArme;
import Personnage.Objets.IObjets;
import Personnage.Objets.TypeArme;

import java.util.Vector;

public interface IPersonnage {
    public int[] getStats();
    public String getNom();
    public String getPrenom();
    public Vector<IObjets> getInventaire();
    public IArme getArmeEquipe();
    public int getNiveau();
    public void cahngerArme(TypeArme armeDesire);
}
