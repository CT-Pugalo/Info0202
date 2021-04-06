package Personnage.Objets.ArmeCommune;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Bouclier extends AArmeCommune {
    public Bouclier(){
        super();
        super.description="Bouclier commun";
        super.typeArme=TypeArme.BOUCLIER;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
