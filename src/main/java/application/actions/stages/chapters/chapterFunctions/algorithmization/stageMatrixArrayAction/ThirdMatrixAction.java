package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirdMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "A matrix is given.\n" +
                "\tPrint the k-th row and p-th column of the matrix.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcThirdFunction();
    }
}