package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventhMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Form a square matrix of order N according to the rule:\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcSeventhFunction();
    }
}