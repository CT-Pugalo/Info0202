package Personnage.Objets;

public abstract class AArmeLegendaire extends AArme{
    public Rare getRarete(){
        return Rare.LEGENDAIRE;
    }

    public abstract String getDescription();

    public int[] getStats() {
        int[] stats = new int[6];
        if(getTypeArme().equals(TypeArme.EPEE)){
            stats= new int[]{/*force*/ 4, /*dex*/ 4, /*const*/ 3, /*intel*/ 1, /*sag*/ 1, /*char*/ 1};
        }else if(getTypeArme().equals(TypeArme.ARC)){
            stats= new int[]{/*force*/ 1, /*dex*/ 4, /*const*/ 1, /*intel*/ 1, /*sag*/ 3, /*char*/ 1};
        }else if(getTypeArme().equals(TypeArme.BATON)){
            stats= new int[]{/*force*/ 1, /*dex*/ 3, /*const*/ 1, /*intel*/ 4, /*sag*/ 4, /*char*/ 1};
        }else if(getTypeArme().equals(TypeArme.BOUCLIER)){
            stats= new int[]{/*force*/ 1, /*dex*/ 1, /*const*/ 4, /*intel*/ 1, /*sag*/ 1, /*char*/ 3};
        }else if(getTypeArme().equals(TypeArme.DAGUE)){
            stats= new int[]{/*force*/ 3, /*dex*/ 4, /*const*/ 1, /*intel*/ 1, /*sag*/ 1, /*char*/ 1};
        }
        return stats;
    }

    public String toString(){
        return "arme commune "+getType()+" "+getDescription();
    }
}
