package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SecondStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Adding extra 'b' after character 'a'";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcSecondFunction();
    }
}
