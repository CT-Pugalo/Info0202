package Personnage.Objets.ArmeTresRare;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeTresRare;
import Personnage.Objets.TypeArme;

public class Arc extends AArmeTresRare {
    public Arc(){
        super();
        super.description="Arc tres rare";
        super.typeArme=TypeArme.ARC;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
