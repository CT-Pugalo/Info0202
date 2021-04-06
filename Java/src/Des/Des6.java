package Des;

public class Des6 extends ADes{
    public Des6(){
        super();
        super.nbDeFace=6;
    }

    public int getNbDeFace() {
        return nbDeFace;
    }
    @Override
    public int jet(){
        return (int)((Math.random()*getNbDeFace())+1);
    }
    public int jet4d6(){
        int[] jets = new int[4];
        int petit=jets[0];
        int s=0;
        for(int i=0; i<4;i++){
            jets[i]=jet();
        }
        for(int i=0; i<jets.length; i++){
            if(jets[i]<petit){
                petit=jets[i];
            }
        }
        for(int i=0; i<jets.length; i++){
            s+=jets[i];
        }
        s-=petit;
        return s;
    }
    public int[] jetStat(){
        int[] res = new int[6];
        for(int i=0; i<6;i++){
            res[i]=jet4d6();
        }
        return res;
    }
}