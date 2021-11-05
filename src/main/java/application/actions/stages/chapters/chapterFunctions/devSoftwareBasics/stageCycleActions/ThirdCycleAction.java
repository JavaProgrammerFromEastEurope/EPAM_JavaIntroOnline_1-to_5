package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class ThirdCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Find the sum of the squares of the first hundred numbers.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcThirdFunction();
    }
}