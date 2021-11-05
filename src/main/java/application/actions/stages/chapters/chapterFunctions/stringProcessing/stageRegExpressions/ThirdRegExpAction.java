package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class ThirdRegExpAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return  "Sort words sentences by number inputted character";
    }

    @Override
    public void action()  {
        strProcActions.get(3).calcThirdFunction();
    }
}
