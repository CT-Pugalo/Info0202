package Personnage.Objets.ArmeCommune;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Epee extends AArmeCommune {

    public Epee(){
        super();
        super.description="Epee commune";
        super.typeArme=TypeArme.EPEE;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
