package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SecondRegExpAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Sort the words sentences by the length";
    }

    @Override
    public void action()  {
        strProcActions.get(3).calcSecondFunction();
    }
}
