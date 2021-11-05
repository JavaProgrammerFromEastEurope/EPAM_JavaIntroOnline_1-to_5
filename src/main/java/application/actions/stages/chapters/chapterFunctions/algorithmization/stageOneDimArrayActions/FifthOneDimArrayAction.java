package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifthOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Integers a1, a2, ..., an are given.\n" +
                "\tPrint only those numbers for which ai> i.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcFifthFunction();
    }
}