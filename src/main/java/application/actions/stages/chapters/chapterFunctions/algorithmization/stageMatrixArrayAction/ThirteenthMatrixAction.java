package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirteenthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Sort matrix columns in ascending and descending order of element values.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcThirteenthFunction();
    }
}