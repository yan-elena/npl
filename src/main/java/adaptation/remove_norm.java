package adaptation;

import jason.asSemantics.DefaultInternalAction;
import jason.asSemantics.TransitionSystem;
import jason.asSemantics.Unifier;
import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import jason.asSyntax.StringTerm;
import jason.asSyntax.Term;

/**
 * An internal action for remove an existing norm in the normative engine of the agent.
 */
public class remove_norm extends DefaultInternalAction {
    @Override
    public Object execute(TransitionSystem ts, Unifier un, Term[] args) throws Exception {
        var ag = (ANormativeAg) ts.getAg();
        StringTerm id = (StringTerm) args[0];
        Literal consequence = (Literal) args[1];
        LogicalFormula activation = (LogicalFormula) args[2];
        ag.getLogger().info("[Action] Remove norm - id: " + id);
        ag.getNPLAInterpreter().removeNorm(id.getString());
        return true;
    }
}
