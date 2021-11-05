package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetDecompositionStages implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All Decomposition Functions";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getDecomposeStage());
    }
}