package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageBranchActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class SecondBranchAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Find max {min(a, b), min(c, d)}\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(1).calcSecondFunction();
    }
}