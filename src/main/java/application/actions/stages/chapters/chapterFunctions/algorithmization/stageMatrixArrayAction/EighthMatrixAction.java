package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EighthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "In a numeric matrix, swap two columns of any column,\n" +
                "\ti.e. put all elements of one column\n" +
                "\tto the corresponding positions of the other,\n" +
                "\tand move its elements of the second to the first.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcEighthFunction();
    }
}
