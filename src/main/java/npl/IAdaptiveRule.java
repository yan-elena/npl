package npl;

import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;

public interface IAdaptiveRule {

    String getId();

//    LogicalFormula getCondition();

    Literal getDeliberateConsequence();

    Literal getExecuteConsequence();

    IAdaptiveRule cloneSanction();
}
