package Personnage.Objets.ArmePeuCommune;

import Personnage.Objets.AArmePeuCommune;
import Personnage.Objets.TypeArme;

public class Bouclier extends AArmePeuCommune {
    public Bouclier(){
        super();
        super.description="Bouclier commun";
        super.typeArme=TypeArme.BOUCLIER;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
