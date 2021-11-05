package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EighthDecAction extends BaseAlgorithmAction implements IAction {


    @Override
    public String description() {
        return "Determine the following sums:\n" +
                "\tD[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcEighthFunction();
    }
}
