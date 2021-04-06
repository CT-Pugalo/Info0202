package Des;

public abstract class ADes implements IDes{
    protected int nbDeFace;
    public abstract int getNbDeFace();
    public int jet(){
        int random;
        random=(int)((Math.random()*getNbDeFace()));
        return random;
    }
}