package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventhOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "You are given real numbers a1, a2, ..., an.\n" +
                "\tTo find max (a1 + a2n, a2 + a2n − 1, ..., an + an + 1).\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcSeventhFunction();
    }
}
