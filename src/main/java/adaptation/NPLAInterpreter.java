package adaptation;

import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import npl.INorm;
import npl.NPLFactory;
import npl.NPLInterpreter;

public class NPLAInterpreter extends NPLInterpreter {
    private final NPLFactory nplFactory;

    public NPLAInterpreter() {
        nplFactory = new NPLFactory();
    }

    public void addNorm(String id, Literal consequence, LogicalFormula activation) {
        final INorm norm = this.nplFactory.createNorm(id, consequence, activation);
        super.addNorm(norm);
    }
}
