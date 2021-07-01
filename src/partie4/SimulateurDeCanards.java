package partie4;

public class SimulateurDeCanards {

    public static void main(String[] args) {
        SimulateurDeCanards simulateur = new SimulateurDeCanards();
        FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeComptage();
        simulateur.simuler(fabriqueDeCanards);
    }

    public void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanards) {
        Cancaneur colvert = fabriqueDeCanards.creerColvert();
        Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
        System.out.println("\nSimulateur de canards");
        simuler(colvert);
        simuler(mandarin);
    }

    public void simuler(Cancaneur canard) {
        canard.cancaner();
    }

}
