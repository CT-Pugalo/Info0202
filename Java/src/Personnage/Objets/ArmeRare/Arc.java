package Personnage.Objets.ArmeRare;

import Personnage.Objets.AArmeRare;
import Personnage.Objets.TypeArme;

public class Arc extends AArmeRare {
    public Arc(){
        super();
        super.description="Arc Rare";
        super.typeArme=TypeArme.ARC;
    }
    public TypeArme getTypeArme() {
        return typeArme;
    }

    public String getDescription() {
        return description;
    }
}
