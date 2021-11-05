package application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FifthStringArrayAction extends BaseStringProcAction implements IAction {

    @Override
    public String description() {
        return "Sequence Comma Character";
    }

    @Override
    public void action() {
        strProcActions.get(1).calcFifthFunction();
    }
}
