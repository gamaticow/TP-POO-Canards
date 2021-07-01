package partie7;

public class CompteurDeCouacs implements Cancaneur {
	
	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	
	public CompteurDeCouacs(Cancaneur cancaneur) {
		this.cancaneur = cancaneur;
	}
	
	@Override
	public void cancaner() {
		cancaneur.cancaner();
		nombreDeCouacs++;
	}
	
	public static int getCouacs() {
		return nombreDeCouacs;
	}
	
	@Override
	public void enregistrerObservateur(Observateur observateur) {
	}

	@Override
	public void notifierObservateur() {
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		cancaneur.accept(v);
	}

}
