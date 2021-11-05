package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Determine between which\n" +
                "\tof pairs of points, the greatest distance.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcFourthFunction();
    }
}