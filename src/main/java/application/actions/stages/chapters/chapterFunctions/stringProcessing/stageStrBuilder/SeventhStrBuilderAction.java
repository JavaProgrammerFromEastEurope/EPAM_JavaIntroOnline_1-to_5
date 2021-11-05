package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SeventhStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "The building a 'cbe' string";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcSeventhFunction();
    }
}