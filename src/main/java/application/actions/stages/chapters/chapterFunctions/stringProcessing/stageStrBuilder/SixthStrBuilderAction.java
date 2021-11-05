package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SixthStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Double every string character ";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcSixthFunction();
    }
}
