package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FirstStringArrayAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "The camel case to snake case string";
    }

    @Override
    public void action() {
        strProcActions.get(1).calcFirstFunction();
    }
}
