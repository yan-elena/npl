package npl;

import jason.asSyntax.Literal;

public abstract class AbstractAdaptiveRule implements IAdaptiveRule {

    protected String id;

    protected Literal deliberateConsequence;

    protected Literal executeConsequence;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Literal getDeliberateConsequence() {
        return deliberateConsequence;
    }

    @Override
    public Literal getExecuteConsequence() {
        return executeConsequence;
    }
}
