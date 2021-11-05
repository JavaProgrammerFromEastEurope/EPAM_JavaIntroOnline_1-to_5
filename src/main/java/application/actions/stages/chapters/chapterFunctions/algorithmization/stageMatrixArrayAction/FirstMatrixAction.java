package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "A matrix is given.\n" +
                "\tDisplay all odd columns with the first item greater than the last.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcFirstFunction();
    }
}
