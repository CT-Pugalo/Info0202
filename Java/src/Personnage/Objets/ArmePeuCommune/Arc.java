package Personnage.Objets.ArmePeuCommune;

import Personnage.Objets.AArmePeuCommune;
import Personnage.Objets.TypeArme;

public class Arc extends AArmePeuCommune {
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
