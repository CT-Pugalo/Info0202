package Personnage.Objets.ArmeLegendaire;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeLegendaire;
import Personnage.Objets.TypeArme;

public class Arc extends AArmeLegendaire {
    public Arc(){
        super();
        super.description="Arc legendaire: Arc du premier rois Elfe";
        super.typeArme=TypeArme.ARC;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
