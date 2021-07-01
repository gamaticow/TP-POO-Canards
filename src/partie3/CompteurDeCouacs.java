package partie3;

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

}
