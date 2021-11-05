package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageLineActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.BaseSoftwareAction;

public class FirstLineAction extends BaseSoftwareAction implements IAction {

    @Override
    public String description() {
        return "Find the value of the function:\n" +
                "\t z = ((a - 3) * b / 2) + c\n";
    }

    @Override
    public void action() {
        devSoftwareActions.get(3).calcFirstFunction();
    }
}
