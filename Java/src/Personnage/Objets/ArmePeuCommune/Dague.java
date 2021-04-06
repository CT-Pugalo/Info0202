package Personnage.Objets.ArmePeuCommune;

import Personnage.Objets.AArmePeuCommune;
import Personnage.Objets.TypeArme;

public class Dague extends AArmePeuCommune {
    public Dague(){
        super();
        super.description="Dague commune";
        super.typeArme=TypeArme.DAGUE;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }
    public String getDescription() {
        return description;
    }
}
