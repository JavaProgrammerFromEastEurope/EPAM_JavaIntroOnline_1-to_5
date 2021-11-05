package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetLinearStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All Line Functions";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getLineStage());
    }
}
