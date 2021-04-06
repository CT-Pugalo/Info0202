package Des;

public class Des100 extends ADes{
    private IDes[] Des10;
    public Des100(){
        super();
        super.nbDeFace=100;
        Des10= new IDes[]{new Des10(), new Des10()};
    }

    public int getNbDeFace() {
        return nbDeFace;
    }

    @Override
    public int jet(){
        int random = (Des10[0].jet()*10)+(Des10[1].jet());
        if(random==0){
            return 100;
        }
        return random;
    }

}
