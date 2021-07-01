package partie7;

public class Colvert implements Cancaneur {
	
	private Observable observable;
	
	public Colvert() {
		this.observable = new Observable(this);
	}
	
    @Override
    public void cancaner() {
        System.out.println("Coincoin");
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
