package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class SecondCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Calculate the values of the function on the segment [a, b] with step h:\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcSecondFunction();
    }
}
