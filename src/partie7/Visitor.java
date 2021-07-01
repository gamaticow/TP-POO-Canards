package partie7;

public interface Visitor {
	
	void visit(Troupe troupe);
	
	void visit(Colvert colvert);
	
	void visit(Mandarin mandarin);
	
	void visit(Appelant appelant);
	
	void visit(CanardEnPlastique canardEnPlastique);
	
	void visit(AdaptateurDOie adaptateurDOie);
	
	void visit(CompteurDeCouacs compteurDeCouacs);
	
	void visit(Visitable visitable);
	
}
