package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SixteenthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Define the sum of n - digit numbers containing only odd digits.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcSixteenthFunction();
    }
}
