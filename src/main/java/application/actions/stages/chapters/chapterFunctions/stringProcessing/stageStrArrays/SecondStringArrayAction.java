package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SecondStringArrayAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "The 'Word' to 'Letter' replacement";
    }

    @Override
    public void action() {
        strProcActions.get(1).calcSecondFunction();
    }
}
