package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;


public class FifthDecAction  extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Print a number which is less than the maximum element of the array,\n" +
                "\tbut more than all other elements\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcFifthFunction();
    }
}