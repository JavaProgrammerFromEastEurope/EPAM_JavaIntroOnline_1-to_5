package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageLineActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class ThirdLineAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Calculate the value of the expression using the formula" +
                " (all variables take on real values):\n" +
                "\t(sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(xy)\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(3).calcThirdFunction();
    }
}