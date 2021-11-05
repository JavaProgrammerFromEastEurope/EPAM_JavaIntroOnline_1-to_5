package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class SixthCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        int character = 123395;
        return String.format("The correspondences between symbols and %n" +
                "\ttheir numerical designations in the computer memory.%c %n", (char) character);
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcSixthFunction();
    }
}