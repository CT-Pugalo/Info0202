package Personnage.Objets.ArmeCommune;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Baton extends AArmeCommune {
    public Baton(){
        super();
        super.description="Baton commun";
        super.typeArme=TypeArme.BATON;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
