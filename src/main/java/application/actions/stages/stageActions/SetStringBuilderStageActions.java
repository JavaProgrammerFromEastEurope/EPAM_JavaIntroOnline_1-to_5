package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetStringBuilderStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All String Builder Processing ";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getBuildStage());
    }
}