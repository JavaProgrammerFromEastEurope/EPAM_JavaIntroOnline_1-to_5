package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetCycleStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All Cycle Functions";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getCycleStage());
    }
}
