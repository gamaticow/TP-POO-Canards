package partie6;

public class Appelant implements Cancaneur {
	
private Observable observable;
	
	public Appelant() {
		this.observable = new Observable(this);
	}
	
    @Override
    public void cancaner() {
        System.out.println("Couincouin");
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
}
