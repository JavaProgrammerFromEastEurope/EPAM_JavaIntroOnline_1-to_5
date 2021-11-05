package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageLineActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class SixthLineAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "For a given area, prints true - if the point with coordinates (x, y)\n" +
                "\tbelongs to the filled area, and false - otherwise.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(3).calcSixthFunction();
    }
}