package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FifthCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Given a number series and some number e.\n" +
                "\tFind the sum of those terms of the series whose modulus is greater than or equal to given e.\n" +
                "\tThe general term of the series is:\n" +
                "\t|1 / (2 ^ n) + 1 / (3 ^ n)|\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcFifthFunction();
    }
}