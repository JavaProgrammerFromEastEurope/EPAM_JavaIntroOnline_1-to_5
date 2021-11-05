package application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EightSortArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Creates fractions to the total\n" +
                "\tdenominator and orders them in ascending order.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(3).calcEighthFunction();
    }
}