package npl;

import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import npl.parser.ParseException;

public interface INPLFactory {
    INorm createNorm(String id, Literal consequence, LogicalFormula activationCondition);
    INorm parseNorm(String norm, DynamicFactsProvider dfp) throws Exception;

    default ISanctionRule createSanctionRule(Literal trigger, LogicalFormula condition, Literal consequence) throws ParseException { return null; }

//    default IAdaptiveRule createAdaptiveRule(String id, LogicalFormula condition, Literal deliberateConsequence, Literal executeConsequence) throws ParseException {return null; }

    default IAdaptiveRule createAdaptiveRule(String id, Literal deliberateConsequence, Literal executeConsequence) throws ParseException {return null; }

}
