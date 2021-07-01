package partie7;

public class AdaptateurDOie implements Cancaneur {

    private final Oie oie;
    private Observable observable;

    public AdaptateurDOie(Oie oie){
        this.oie = oie;
        this.observable = new Observable(this);
    }

    @Override
    public void cancaner() {
        oie.cacarder();
        notifierObservateur();
    }
    
    @Override
	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
	}

	@Override
	public void notifierObservateur() {
		observable.notifierObservateur();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
