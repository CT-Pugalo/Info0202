package Personnage.Objets;

public abstract class AArme implements IArme{
    private final Type type=Type.ARME;
    protected String description;
    protected TypeArme typeArme;

    public Type getType() {
        return type;
    }

    public abstract TypeArme getTypeArme();

    public abstract String getDescription();

    public abstract int[] getStats();

    public abstract Rare getRarete();

    public String toString(){
        return getType()+" "+getDescription();
    }
}