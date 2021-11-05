package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;


public class NinthDecAction  extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Given the numbers X, Y, Z, T - the lengths of the sides of the quadrilateral.\n" +
                "\tWrite a method (methods) for calculating its area,\n" +
                "\tif the angle between the sides of length X and Y is straight.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcNinthFunction();
    }
}