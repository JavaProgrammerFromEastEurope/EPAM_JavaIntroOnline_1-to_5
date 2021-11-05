package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageLineActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class SecondLineAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Calculate the value of the expression using the formula (all variables are valid):\n" +
                "\t((b + sqrt(b^2 + 4ac)) / 2a) - (a^3c + b^-2)\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(3).calcSecondFunction();
    }
}