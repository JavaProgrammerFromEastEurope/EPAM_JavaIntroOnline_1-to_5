package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifteenMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find the largest element of the matrix\n" +
                "\tand replace all odd elements with it.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcFifteenthFunction();
    }
}