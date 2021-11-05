package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class NinthOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find the most frequent number in an array of integers with n elements.\n" +
                "\tIf such there are several numbers, then determine the smallest of them.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcNinthFunction();
    }
}
