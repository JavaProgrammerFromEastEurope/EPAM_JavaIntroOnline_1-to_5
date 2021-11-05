package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class EightStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Find the longest words";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcEighthFunction();
    }
}