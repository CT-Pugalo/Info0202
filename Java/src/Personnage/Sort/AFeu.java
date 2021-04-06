package Personnage.Sort;

public abstract class AFeu extends ASort{
    protected Type strongAgainst = Type.GALCE;

    public Type getType(){
        return Type.FEU;
    }
    public Type getStrongAgainst(){
        return strongAgainst;
    }
}