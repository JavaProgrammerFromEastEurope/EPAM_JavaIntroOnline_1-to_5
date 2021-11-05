package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Finding the greatest common divisor\n" +
                "\tand least common multiple of two natural numbers.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcFirstFunction();
    }
}
