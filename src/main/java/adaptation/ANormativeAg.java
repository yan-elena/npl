package adaptation;

import jason.asSyntax.Literal;
import jason.asSyntax.LogicalFormula;
import npl.NormativeAg;
import util.NPLMonitor;

/**
 * An extended normative agent with the capability to adapt regulations.
 */
public class ANormativeAg extends NormativeAg {

    public ANormativeAg() {
        this.interpreter = new NPLAInterpreter();
    }

    @Override
    public void initAg() {
        super.initAg();
        //todo: comment to disable the npl inspector
        NPLMonitor gui = new NPLMonitor();
        try {
            gui.add("demo", interpreter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NPLAInterpreter getNPLAInterpreter() {
        return (NPLAInterpreter) this.interpreter;
    }

//    /**
//     * Add a new norm specification.
//     * @param id the id of the norm
//     * @param consequence the failure or deontic consequence of the norm
//     * @param activation the activation condition of the norm
//     */
//    public void addNorm(String id, Literal consequence, LogicalFormula activation) {
//        ((NPLAInterpreter) this.interpreter).addNorm(id, consequence, activation);
//    }
//
//    public void modifyNorm()
}
