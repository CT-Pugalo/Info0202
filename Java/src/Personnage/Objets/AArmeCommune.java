package Personnage.Objets;

public abstract class AArmeCommune extends AArme{

    public Rare getRarete(){
        return Rare.COMMUNE;
    }

    public abstract String getDescription();

    public int[] getStats() {
        int[] stats = new int[6];
        if(getTypeArme().equals(TypeArme.EPEE)){
            stats= new int[]{/*force*/ 0, /*dex*/ 0, /*const*/ 0, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.ARC)){
            stats= new int[]{/*force*/ 0, /*dex*/ 0, /*const*/ 0, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.BATON)){
            stats= new int[]{/*force*/ 0, /*dex*/ 0, /*const*/ 0, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.BOUCLIER)){
            stats= new int[]{/*force*/ 0, /*dex*/ 0, /*const*/ 0, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }else if(getTypeArme().equals(TypeArme.DAGUE)){
            stats= new int[]{/*force*/ 0, /*dex*/ 0, /*const*/ 0, /*intel*/ 0, /*sag*/ 0, /*char*/ 0};
        }
        return stats;
    }

    public String toString(){
        return "arme commune "+getType()+" "+getDescription();
    }
}
