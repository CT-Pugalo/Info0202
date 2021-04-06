package Personnage.Race;

public class DemiElfe extends ARace{
    public DemiElfe(){
        super();
        super.taille=Taille.GRAND;
        super.vitesse=9;
        super.bonusForce=0;
        super.bonusDexterite=0;
        super.bonusConstitution=0;
        super.bonusIntelligence=0;
        super.bonusSagesse=0;
        super.bonusCharisme=0;
    }

    @Override
    public Taille getTaille() {
        return taille;
    }

    @Override
    public int getVitesse() {
        return vitesse;
    }

    @Override
    public int getBonusForce() {
        return bonusForce;
    }

    @Override
    public int getBonusDexterite() {
        return bonusDexterite;
    }

    @Override
    public int getBonusConstitution() {
        return bonusConstitution;
    }

    @Override
    public int getBonusIntelligence() {
        return bonusIntelligence;
    }

    @Override
    public int getBonusSagesse() {
        return bonusSagesse;
    }

    @Override
    public int getBonusCharisme() {
        return bonusCharisme;
    }
}
