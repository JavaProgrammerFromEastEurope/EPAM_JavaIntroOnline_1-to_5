package application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstSortArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Two one-dimensional arrays with different elements and a natural number k are given.\n" +
                "\tCombine them into one array, including the second array between the kth and (k + 1).\n";
    }

    @Override
    public void action() {
        algorithmActions.get(3).calcFirstFunction();
    }
}
