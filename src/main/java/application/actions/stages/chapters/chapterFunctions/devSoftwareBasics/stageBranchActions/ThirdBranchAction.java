package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageBranchActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class ThirdBranchAction extends BaseSoftwareAction implements IAction {
    @Override
    public String description() {
        return "Three points - A(x1,y1), B(x2,y2) and C(x3,y3) are given.\n" +
                " \tDetermine if they will be located on the same line.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(1).calcThirdFunction();
    }
}