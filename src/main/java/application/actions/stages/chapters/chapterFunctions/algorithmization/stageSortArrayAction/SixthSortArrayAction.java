package application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SixthSortArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Shells sorting.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(3).calcSixthFunction();
    }
}