package Personnage.Objets.ArmeRare;
import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeRare;
import Personnage.Objets.TypeArme;

public class Dague extends AArmeRare {
    public Dague(){
        super();
        super.description="Dague rare";
        super.typeArme=TypeArme.DAGUE;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }
    public String getDescription() {
        return description;
    }
}
