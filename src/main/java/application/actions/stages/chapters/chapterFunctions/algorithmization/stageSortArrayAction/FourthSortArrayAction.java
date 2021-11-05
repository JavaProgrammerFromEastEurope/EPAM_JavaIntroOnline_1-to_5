package application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourthSortArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Sort by exchanging.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(3).calcFourthFunction();
    }
}