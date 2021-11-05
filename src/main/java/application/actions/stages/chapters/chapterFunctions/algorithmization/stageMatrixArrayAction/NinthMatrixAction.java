package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class NinthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "A matrix of non-negative numbers is given.\n" +
                "\tCalculate the sum of the items in each column.\n" +
                "\tDetermine which the column contains the maximum amount\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcNinthFunction();
    }
}