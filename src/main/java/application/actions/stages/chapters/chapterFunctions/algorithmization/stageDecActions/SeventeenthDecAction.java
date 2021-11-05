package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventeenthDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "The sum of its digits was subtracted from the given number.\n" +
                "\tThe sum of its digits was again subtracted from the result, etc.\n" +
                "\tHow many such actions need to be performed to get zero?\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcSeventeenthFunction();
    }
}
