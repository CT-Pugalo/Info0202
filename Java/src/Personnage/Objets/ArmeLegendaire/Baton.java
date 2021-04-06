package Personnage.Objets.ArmeLegendaire;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Baton extends AArmeCommune {
    public Baton(){
        super();
        super.description="Baton legendaire: baton mythique taillé dans le bois de l'Yggdrasil";
        super.typeArme=TypeArme.BATON;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
