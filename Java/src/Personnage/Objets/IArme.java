package Personnage.Objets;

public interface IArme extends IObjets {
    public TypeArme getTypeArme();
    public Rare getRarete();
    public int[] getStats();
}
