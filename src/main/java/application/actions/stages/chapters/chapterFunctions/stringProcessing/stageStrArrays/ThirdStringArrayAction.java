package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class ThirdStringArrayAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Counter of digits in the string";
    }

    @Override
    public void action() {
        strProcActions.get(1).calcThirdFunction();
    }
}