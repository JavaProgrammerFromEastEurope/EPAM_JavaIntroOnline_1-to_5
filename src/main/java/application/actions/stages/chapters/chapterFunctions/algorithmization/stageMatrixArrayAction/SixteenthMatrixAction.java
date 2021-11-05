package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SixteenthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "A magic square of order n is a square nxn matrix\n" +
                "\tcomposed of numbers 1, 2, 3, ...,2n\n" +
                "\tso that the sums for each column, each row,\n" +
                "\tand each of the two large diagonals are equals\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcSixteenthFunction();
    }
}