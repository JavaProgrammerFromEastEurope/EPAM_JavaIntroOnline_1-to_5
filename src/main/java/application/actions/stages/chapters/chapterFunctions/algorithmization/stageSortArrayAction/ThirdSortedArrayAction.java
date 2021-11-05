package application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirdSortedArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Sort by selection.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(3).calcThirdFunction();
    }
}