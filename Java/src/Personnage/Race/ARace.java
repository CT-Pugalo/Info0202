package Personnage.Race;

public abstract class ARace implements IRace{

    protected Taille taille;
    protected int vitesse;
    protected int bonusForce;
    protected int bonusDexterite;
    protected int bonusConstitution;
    protected int bonusIntelligence;
    protected int bonusSagesse;
    protected int bonusCharisme;

    public abstract Taille getTaille();
    public abstract int getVitesse();
    public abstract int getBonusForce();
    public abstract int getBonusDexterite();
    public abstract int getBonusConstitution();
    public abstract int getBonusIntelligence();
    public abstract int getBonusSagesse();
    public abstract int getBonusCharisme();

    public int[] getStats(){
        return new int[]{getBonusForce(),getBonusDexterite(),getBonusConstitution(),+getBonusIntelligence(),getBonusSagesse(),getBonusCharisme()};
    }

    public String tostring(){
        return getBonusForce()+", "+getBonusDexterite()+", "+getBonusConstitution()+", "+getBonusIntelligence()+", "+getBonusSagesse()+", "+getBonusCharisme();
    }
}
