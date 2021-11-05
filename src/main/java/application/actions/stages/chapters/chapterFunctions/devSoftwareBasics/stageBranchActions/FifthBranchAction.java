package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageBranchActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FifthBranchAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Calculate the value of the function:\n" +
                "\tif(x <= 3) - |x^2 - 3x + 9|\n " +
                "\tif(x > 3) - |1 / (x^3 + 6)|\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(1).calcFifthFunction();
    }
}