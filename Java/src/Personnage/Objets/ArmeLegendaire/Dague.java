package Personnage.Objets.ArmeLegendaire;
import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Dague extends AArmeCommune {
    public Dague(){
        super();
        super.description="Dague legendaire: dague du rois des voleurs";
        super.typeArme=TypeArme.DAGUE;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }
    public String getDescription() {
        return description;
    }
}
