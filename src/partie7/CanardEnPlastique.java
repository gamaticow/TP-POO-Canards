package partie7;

public class CanardEnPlastique implements Cancaneur {
	
	private Observable observable;
	
	public CanardEnPlastique() {
		this.observable = new Observable(this);
	}
	
    @Override
    public void cancaner() {
        System.out.println("Couic");
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
