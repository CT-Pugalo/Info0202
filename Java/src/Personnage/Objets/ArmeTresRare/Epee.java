package Personnage.Objets.ArmeTresRare;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeTresRare;
import Personnage.Objets.TypeArme;

public class Epee extends AArmeTresRare {

    public Epee(){
        super();
        super.description="Epee tres rare";
        super.typeArme=TypeArme.EPEE;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
