package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TenthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Find the positive elements of the main diagonal of a square matrix.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcTenthFunction();
    }
}