package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SecondDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find the greatest common divisor of four natural numbers.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcSecondFunction();
    }
}