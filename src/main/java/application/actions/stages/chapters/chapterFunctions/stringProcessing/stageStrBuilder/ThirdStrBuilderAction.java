package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class ThirdStrBuilderAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "The list of palindrome strings ";
    }

    @Override
    public void action() {
        strProcActions.get(2).calcThirdFunction();
    }
}
