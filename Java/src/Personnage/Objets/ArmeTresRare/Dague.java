package Personnage.Objets.ArmeTresRare;
import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeTresRare;
import Personnage.Objets.TypeArme;

public class Dague extends AArmeTresRare {
    public Dague(){
        super();
        super.description="Dague tres rare";
        super.typeArme=TypeArme.DAGUE;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }
    public String getDescription() {
        return description;
    }
}
