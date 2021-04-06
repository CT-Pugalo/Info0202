package Personnage.Objets.ArmeRare;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeRare;
import Personnage.Objets.TypeArme;

public class Epee extends AArmeRare {

    public Epee(){
        super();
        super.description="Epee rare";
        super.typeArme=TypeArme.EPEE;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
