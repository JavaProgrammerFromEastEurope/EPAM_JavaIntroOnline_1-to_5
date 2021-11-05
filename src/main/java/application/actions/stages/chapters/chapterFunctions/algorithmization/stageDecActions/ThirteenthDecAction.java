package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirteenthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find and print all pairs of 'twins' from the segment [n, 2n],\n" +
                "\twhere n is a given natural number greater than 2\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcThirteenthFunction();
    }
}