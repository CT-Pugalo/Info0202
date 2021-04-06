package Personnage.Sort;

public abstract class ASort implements ISort{

    protected int intelRequis;
    protected int[] degat;
    protected Type type;

    public abstract int getIntelRequis();
    public abstract int[] getDegat();
    public abstract Type getType();

    public String toString(){
        return "Personnage.Sort de "+getType()+", "+getIntelRequis()+" point d'intelligence requis pour l'activation, le sort feras de "+getDegat()[0]+" a "+getDegat()[1]+ "pts de degat";
    }
}
