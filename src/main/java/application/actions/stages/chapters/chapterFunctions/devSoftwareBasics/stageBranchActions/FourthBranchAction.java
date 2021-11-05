package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageBranchActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FourthBranchAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "The dimensions A, B of the rectangular hole \n  " +
                "\tand the dimensions - (x, y, z) of the brick are given.\n  " +
                "\tDetermine if a brick will pass through hole.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(1).calcFourthFunction();
    }
}