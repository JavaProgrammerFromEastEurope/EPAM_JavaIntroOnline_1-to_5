package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FirstStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Find max number in a sequence of a space literal";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcFirstFunction();
    }
}
