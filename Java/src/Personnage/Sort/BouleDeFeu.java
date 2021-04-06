package Personnage.Sort;

public class BouleDeFeu extends AFeu{

    public BouleDeFeu(){
        super();
        super.intelRequis=5;
        super.degat= new int[]{5, 10};
    }

    public int getIntelRequis() {
        return intelRequis;
    }

    public int[] getDegat() {
        return degat;
    }

    public String toString(){
        return "Boule de feu "+super.toString();
    }
}
