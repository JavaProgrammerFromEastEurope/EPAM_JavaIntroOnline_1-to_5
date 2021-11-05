package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TenthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Forming an array, the elements of which\n" +
                "\tare the digits of the number N.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcTenthFunction();
    }
}
