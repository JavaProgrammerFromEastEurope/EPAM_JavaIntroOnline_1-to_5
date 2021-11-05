package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourteenthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Generate a random m x n matrix consisting of zeros and ones,\n" +
                "\tand in each column the number units is equal to column number.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcFourteenthFunction();
    }
}
