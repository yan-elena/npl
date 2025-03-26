package npla;

import jason.asSyntax.Literal;
import npl.parser.ParseException;

public class AdaptiveRule extends AbstractAdaptiveRule {
    public AdaptiveRule(String id, Literal deliberateConsequence, Literal executeConsequence) throws ParseException {
        if (!deliberateConsequence.getFunctor().equals("deliberate")) {
            throw new ParseException("adaptive-rule deliberate consequence must use functor 'deliberate' instead of " + deliberateConsequence.getFunctor());
        }
//        if (deliberateConsequence.getArity() != XXX ) //todo: check for arguments in deliberate(XXX)
        if (!executeConsequence.getFunctor().equals("execute")) {
            throw new ParseException("adaptive-rule execute consequence must use functor 'execute' instead of " + executeConsequence.getFunctor());
        }
        this.id = id;
        this.deliberateConsequence = deliberateConsequence;
        this.executeConsequence = executeConsequence;
    }

    @Override
    public IAdaptiveRule cloneSanction() {
        try {
            return new AdaptiveRule(id, deliberateConsequence.copy(), executeConsequence.copy());
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "adaptive-rule " + id +  " -> " + getDeliberateConsequence() + getExecuteConsequence();
    }
}
