package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FifthStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Find the number of a character 'a'";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcFifthFunction();
    }
}