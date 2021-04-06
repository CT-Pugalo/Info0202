package Personnage.Objets.ArmeTresRare;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeTresRare;
import Personnage.Objets.TypeArme;

public class Baton extends AArmeTresRare {
    public Baton(){
        super();
        super.description="Baton tres rare";
        super.typeArme=TypeArme.BATON;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
