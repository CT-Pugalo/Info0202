package Personnage.Objets.ArmeCommune;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Arc extends AArmeCommune {
    public Arc(){
        super();
        super.description="Arc commun";
        super.typeArme=TypeArme.ARC;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
