package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "The array A [N] contains natural numbers.\n" +
                "\t Find the sum of those elements that are multiples of a given K.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcFirstFunction();
    }
}