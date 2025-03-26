package npla;

import jason.asSyntax.Literal;

public interface IAdaptiveRule {

    String getId();

//    LogicalFormula getCondition();

    Literal getDeliberateConsequence();

    Literal getExecuteConsequence();

    IAdaptiveRule cloneSanction();
}
