package application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirdOneDimArrayAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "An array of real numbers is given, the dimension of which is N.\n" +
                "\tCalculate how many negative numbers there are in it,\n" +
                "\tpositive and zero elements.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(1).calcThirdFunction();
    }
}
