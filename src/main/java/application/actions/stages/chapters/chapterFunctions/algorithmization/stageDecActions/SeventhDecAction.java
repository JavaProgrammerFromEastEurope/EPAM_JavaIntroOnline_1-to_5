package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventhDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Calculate the sum of the factorials of all odd numbers from 1 to 9.\n";
    }

    @Override
    public void action()  {
        algorithmActions.get(4).calcSeventhFunction();
    }
}
