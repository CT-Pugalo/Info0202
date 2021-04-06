package Personnage.Objets.ArmeRare;

import Personnage.Objets.AArmeRare;
import Personnage.Objets.TypeArme;

public class Baton extends AArmeRare {
    public Baton(){
        super();
        super.description="Baton Rare";
        super.typeArme=TypeArme.BATON;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
