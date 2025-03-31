package adaptation;

import jason.asSemantics.DefaultInternalAction;
import jason.asSemantics.TransitionSystem;
import jason.asSemantics.Unifier;
import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import jason.asSyntax.StringTerm;
import jason.asSyntax.Term;

public class add_norm extends DefaultInternalAction {
    @Override
    public Object execute(TransitionSystem ts, Unifier un, Term[] args) throws Exception {
        var ag = (ANormativeAg) ts.getAg();
        ag.getLogger().info("[ADAPTATION] Add new norm: ");
        StringTerm id = (StringTerm) args[0];
        Literal consequence = (Literal) args[1];
        LogicalFormula activation = (LogicalFormula) args[2];
        ag.addNorm(id.getString(), consequence, activation);
        return true;
    }
}
