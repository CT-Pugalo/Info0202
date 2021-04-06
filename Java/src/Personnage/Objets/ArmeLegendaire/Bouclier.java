package Personnage.Objets.ArmeLegendaire;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Bouclier extends AArmeCommune {
    public Bouclier(){
        super();
        super.description="Bouclier legendaire: bouclier divin donne aux hommes par un ange";
        super.typeArme=TypeArme.BOUCLIER;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
