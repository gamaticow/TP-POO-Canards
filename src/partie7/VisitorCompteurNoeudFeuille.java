package partie7;

public class VisitorCompteurNoeudFeuille implements Visitor {
	
	// Compteurs
	private int nbNoeud = 0;
	private int nbFeuille = 0;
	
	//Accesseurs aux compteurs
	public int getNbFeuille() {
		return nbFeuille;
	}
	
	public int getNbNoeud() {
		return nbNoeud;
	}
	
	@Override
	public void visit(Troupe troupe) {
		System.out.println("t");
		nbNoeud++;
	}

	@Override
	public void visit(Colvert colvert) {
		nbFeuille++;
	}

	@Override
	public void visit(Mandarin mandarin) {
		nbFeuille++;
	}

	@Override
	public void visit(Appelant appelant) {
		nbFeuille++;
	}

	@Override
	public void visit(CanardEnPlastique canardEnPlastique) {
		nbFeuille++;
	}

	@Override
	public void visit(AdaptateurDOie adaptateurDOie) {
		nbFeuille++;
	}

	@Override
	public void visit(CompteurDeCouacs compteurDeCouacs) {
		System.out.println("c");
		nbNoeud++;
	}

	@Override
	public void visit(Visitable visitable) {
		System.out.println("Classe pas encore gérée");
	}

}
