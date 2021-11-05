package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageLineActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FifthLineAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "A natural number T is given, which represents the duration of the elapsed time in seconds.\n" +
                "\tWithdraw the given duration value in hours, minutes and seconds in the following form:\n" +
                "\tNNh MM min SSc.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(3).calcFifthFunction();
    }
}