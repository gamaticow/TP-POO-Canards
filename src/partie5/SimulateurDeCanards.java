package partie5;

public class SimulateurDeCanards {

    public static void main(String[] args) {
        SimulateurDeCanards simulateur = new SimulateurDeCanards();
        FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeComptage();
        simulateur.simuler(fabriqueDeCanards);
    }

    public void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanards) {
        Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
        Cancaneur appelant = fabriqueDeCanards.creerAppelant();
        Troupe troupeDeCanards = new Troupe();
		troupeDeCanards.add(mandarin);
		troupeDeCanards.add(appelant);
		
		Troupe troupeDeColverts = new Troupe();
		Cancaneur colvert2 = fabriqueDeCanards.creerColvert();
		Cancaneur colvert3 = fabriqueDeCanards.creerColvert();
		troupeDeColverts.add(colvert2);
		troupeDeColverts.add(colvert3);
				
		troupeDeCanards.add(troupeDeColverts);
		System.out.println("\nSimulateur de canards : Toute la troupe");
		simuler(troupeDeCanards);
		System.out.println("\nSimulateur de canards : Troupe de colverts");
		simuler(troupeDeColverts);

    }

    public void simuler(Cancaneur canard) {
        canard.cancaner();
    }

}
