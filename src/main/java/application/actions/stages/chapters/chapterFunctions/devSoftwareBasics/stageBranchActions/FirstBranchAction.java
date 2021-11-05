package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageBranchActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FirstBranchAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Given two angles of the triangle (in degrees).\n" +
                "\tDetermine whether such a triangle exists, and if so,\n" +
                "\twhether there will be it is rectangular.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(1).calcFirstFunction();
    }
}