package partie3;

public class AdaptateurDOie implements Cancaneur {

    private final Oie oie;

    public AdaptateurDOie(Oie oie){
        this.oie = oie;
    }

    @Override
    public void cancaner() {
        oie.cacarder();
    }
}
