package Personnage.Objets.ArmeTresRare;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeTresRare;
import Personnage.Objets.TypeArme;

public class Bouclier extends AArmeTresRare {
    public Bouclier(){
        super();
        super.description="Bouclier tres rare";
        super.typeArme=TypeArme.BOUCLIER;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
