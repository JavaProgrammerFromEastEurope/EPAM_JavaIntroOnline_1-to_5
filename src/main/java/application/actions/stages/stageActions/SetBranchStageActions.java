package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetBranchStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All Branch Functions";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getBranchStage());
    }
}