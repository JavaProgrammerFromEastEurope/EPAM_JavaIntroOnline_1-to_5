package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class NinthStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "The Count of Upper & Lower case symbols ";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcNinthFunction();
    }
}
