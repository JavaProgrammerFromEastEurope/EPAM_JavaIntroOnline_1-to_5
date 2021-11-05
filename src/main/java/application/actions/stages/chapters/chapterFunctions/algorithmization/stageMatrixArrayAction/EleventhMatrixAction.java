package application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EleventhMatrixAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Fill the 10x20 matrix with random numbers from 0 to 15.\n" +
                "\tDisplay the matrix itself and the row numbers,\n" +
                "\tin which the number 5 occurs three or more times.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(2).calcEleventhFunction();
    }
}