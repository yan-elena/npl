package adaptation;

import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import npl.NormativeAg;

public class ANormativeAg extends NormativeAg {

    public ANormativeAg() {
        this.interpreter = new NPLAInterpreter();
    }

    public void addNorm(String id, Literal consequence, LogicalFormula activation) {
        ((NPLAInterpreter) this.interpreter).addNorm(id, consequence, activation);
    }
}
