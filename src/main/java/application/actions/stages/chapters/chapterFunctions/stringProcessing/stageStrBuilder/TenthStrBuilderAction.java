package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class TenthStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Dividing string by exclamation marks ";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcTenthFunction();
    }
}
