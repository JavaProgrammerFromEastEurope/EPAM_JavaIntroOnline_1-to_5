package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class SeventhCycleAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "For each natural number in the range from m to n,\n " +
                "\toutput all divisors except one and the number itself.\n" +
                "\tThe 'm' and 'n' are entered from the keyboard.\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(2).calcSeventhFunction();
    }
}