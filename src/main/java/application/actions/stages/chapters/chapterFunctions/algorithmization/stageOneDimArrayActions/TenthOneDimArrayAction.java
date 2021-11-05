package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TenthOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "An integer array is given with the number of elements n.\n" +
                "\tCompress the array by throwing out every second element\n" +
                "\t(fill the vacated elements with zeros).\n" +
                "\tNote. Do not use additional array.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcTenthFunction();
    }
}
