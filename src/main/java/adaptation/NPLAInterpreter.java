package adaptation;

import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import npl.INorm;
import npl.NPLFactory;
import npl.NPLInterpreter;

/**
 * An extended NPL Interpreter -- NPL(a) that supports the adaptation of norms.
 */
public class NPLAInterpreter extends NPLInterpreter {
    private final NPLFactory nplFactory;

    public NPLAInterpreter() {
        nplFactory = new NPLFactory();
    }

    /**
     * Add a new norm in the interpreter.
     * @param id the id of the norm
     * @param consequence the failure or deontic consequence of the norm
     * @param activation the activation condition of the norm
     */
    public void addNorm(String id, Literal consequence, LogicalFormula activation) {
        final INorm norm = this.nplFactory.createNorm(id, consequence, activation);
        super.addNorm(norm);
    }
}
