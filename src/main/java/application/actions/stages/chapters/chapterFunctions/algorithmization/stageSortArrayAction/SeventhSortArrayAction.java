package application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventhSortArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "It is required to indicate the places where you want to insert\n" +
                "\tthe elements of the sequence in the first sequence.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(3).calcSeventhFunction();
    }
}