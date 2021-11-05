package application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import application.actions.IAction;
import application.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EleventhDecAction extends BaseAlgorithmAction implements IAction {

    @Override
    public String description() {
        return "Determine which of the given two numbers has more digits.\n";
    }

    @Override
    public void action() {
        algorithmActions.get(4).calcEleventhFunction();
    }
}