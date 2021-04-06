package Personnage.Objets.ArmeCommune;
import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Dague extends AArmeCommune {
    public Dague(){
        super();
        super.description="Dague commune";
        super.typeArme=TypeArme.DAGUE;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }
    public String getDescription() {
        return description;
    }
}
