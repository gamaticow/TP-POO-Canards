package partie5;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur {
	
	private List<Cancaneur> cancaneurs = new ArrayList<>();
	
	public void add(Cancaneur cancaneur) {
		cancaneurs.add(cancaneur);
	}
	
	public void remove(Cancaneur cancaneur) {
		cancaneurs.remove(cancaneur);
	}
	
	@Override
	public void cancaner() {
		cancaneurs.forEach(Cancaneur::cancaner);
	}

}
