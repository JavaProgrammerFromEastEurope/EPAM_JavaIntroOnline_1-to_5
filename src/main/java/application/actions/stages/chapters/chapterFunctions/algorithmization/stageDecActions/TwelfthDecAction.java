package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TwelfthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Format of array A, whose elements\n" +
                "\tare numbers whose sum of digits is equal to K and which are not greater than N.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcTwelfthFunction();
    }
}
