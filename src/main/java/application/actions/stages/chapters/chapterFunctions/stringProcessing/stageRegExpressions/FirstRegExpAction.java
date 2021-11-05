package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FirstRegExpAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Sort paragraphs by number of sentences";
    }

    @Override
    public void action()  {
        strProcActions.get(3).calcFirstFunction();
    }
}
