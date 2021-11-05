package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourthOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "You are given real numbers a1, a2, ..., an.\n" +
                "\tSwap the largest and smallest items.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcFourthFunction();
    }
}
