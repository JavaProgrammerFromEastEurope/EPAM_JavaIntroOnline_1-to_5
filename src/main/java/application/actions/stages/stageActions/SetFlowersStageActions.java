package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetFlowersStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Run Flowers Application";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getFlowerStage());
    }
}