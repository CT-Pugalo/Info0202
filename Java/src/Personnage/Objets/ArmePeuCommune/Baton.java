package Personnage.Objets.ArmePeuCommune;

import Personnage.Objets.AArmePeuCommune;
import Personnage.Objets.TypeArme;

public class Baton extends AArmePeuCommune {
    public Baton(){
        super();
        super.description="Baton commun";
        super.typeArme=TypeArme.BATON;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
