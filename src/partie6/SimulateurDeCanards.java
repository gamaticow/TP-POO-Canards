package partie6;

public class SimulateurDeCanards {

    public static void main(String[] args) {
        SimulateurDeCanards simulateur = new SimulateurDeCanards();
        FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeCanards();
        simulateur.simuler(fabriqueDeCanards);
    }

    public void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanards) {
    	Cancaneur colvert = fabriqueDeCanards.creerColvert();

		Cancanologue leCancanologue = new Cancanologue();

		colvert.enregistrerObservateur(leCancanologue);
		
		simuler(colvert);
    }

    public void simuler(Cancaneur canard) {
        canard.cancaner();
    }

}
