package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FourthCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "The multiplication of the squares of the first two hundred numbers.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcFourthFunction();
    }
}