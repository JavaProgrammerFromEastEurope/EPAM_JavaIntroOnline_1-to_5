package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SixthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Check if the given three numbers are coprimes.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcSixthFunction();
    }
}