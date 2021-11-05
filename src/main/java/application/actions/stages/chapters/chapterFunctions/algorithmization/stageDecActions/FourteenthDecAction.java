package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourteenthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find all Armstrong numbers from 1 to k.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcFourteenthFunction();
    }
}
