package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class EightCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Two numbers are given.\n" +
                "\tDetermine the digits included in the \n" +
                "\trecording of both the first and second numbers.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcEighthFunction();
    }
}