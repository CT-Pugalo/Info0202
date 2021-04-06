package Personnage.Objets.ArmeRare;

import Personnage.Objets.AArmeCommune;
import Personnage.Objets.AArmeRare;
import Personnage.Objets.TypeArme;

public class Bouclier extends AArmeRare {
    public Bouclier(){
        super();
        super.description="Bouclier rare";
        super.typeArme=TypeArme.BOUCLIER;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
