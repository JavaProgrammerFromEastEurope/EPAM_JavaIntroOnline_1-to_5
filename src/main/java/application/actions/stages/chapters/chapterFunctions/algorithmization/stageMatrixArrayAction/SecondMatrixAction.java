package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SecondMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "You are given a square matrix.\n" +
                "\tDisplay the elements on the diagonal.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcSecondFunction();
    }
}
