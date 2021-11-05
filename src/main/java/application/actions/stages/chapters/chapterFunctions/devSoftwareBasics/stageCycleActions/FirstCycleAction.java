package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FirstCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Sums up all numbers from 1 to a user-entered number.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcFirstFunction();
    }
}