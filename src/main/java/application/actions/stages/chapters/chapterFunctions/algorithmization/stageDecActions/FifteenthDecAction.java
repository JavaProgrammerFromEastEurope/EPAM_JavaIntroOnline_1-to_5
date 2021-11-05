package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifteenthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find all natural n-digit numbers whose digits form a strictly increasing sequence.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcFifteenthFunction();
    }
}
