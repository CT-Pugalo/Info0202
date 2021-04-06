package Personnage.Objets.ArmePeuCommune;

import Personnage.Objets.AArmePeuCommune;
import Personnage.Objets.TypeArme;

public class Epee extends AArmePeuCommune {

    public Epee(){
        super();
        super.description="Epee commune";
        super.typeArme=TypeArme.EPEE;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
