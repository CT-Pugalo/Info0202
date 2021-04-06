package Personnage.Objets;

public abstract class AArmeRare extends AArme{

    public Rare getRarete(){
        return Rare.RARE;
    }

    public abstract String getDescription();

    public int[] getStats() {
        int[] stats = new int[6];
        if(getTypeArme().equals(TypeArme.EPEE)){
            stats= new int[]{/*force*/ 2, /*dex*/ 2, /*const*/ 1, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.ARC)){
            stats= new int[]{/*force*/ 0, /*dex*/ 2, /*const*/ 0, /*intel*/ 0, /*sag*/ 1, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.BATON)){
            stats= new int[]{/*force*/ 0, /*dex*/ 1, /*const*/ 0, /*intel*/ 2, /*sag*/ 2, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.BOUCLIER)){
            stats= new int[]{/*force*/ 0, /*dex*/ 0, /*const*/ 2, /*intel*/ 0, /*sag*/ 0, /*char*/ 1};
        }else if(getTypeArme().equals(TypeArme.DAGUE)){
            stats= new int[]{/*force*/ 1, /*dex*/ 2, /*const*/ 0, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }
        return stats;
    }

    public String toString(){
        return "arme commune "+getType()+" "+getDescription();
    }
}
