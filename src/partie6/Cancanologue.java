package partie6;

public class Cancanologue implements Observateur {

	@Override
	public void actualiser(CouacObservable canard) {
		System.out.println("Cancanologue: " + canard + " vient de cancaner");
	}

}
