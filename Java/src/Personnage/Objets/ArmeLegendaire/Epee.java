package Personnage.Objets.ArmeLegendaire;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.TypeArme;

public class Epee extends AArmeCommune {

    public Epee(){
        super();
        super.description="Epee legendaire: sainte epee, on raconte qu'elle pourrais trancher un demon en deux d'un seul coup";
        super.typeArme=TypeArme.EPEE;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
