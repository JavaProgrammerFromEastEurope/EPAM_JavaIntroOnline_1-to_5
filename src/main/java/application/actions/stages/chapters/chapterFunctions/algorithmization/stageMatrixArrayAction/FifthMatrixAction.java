package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifthMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Form a square matrix\n" +
                "\tof order n according to a given pattern (n is even):\n"+
                "\tSecond variation (see pattern in the file):\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcFifthFunction();
    }
}
