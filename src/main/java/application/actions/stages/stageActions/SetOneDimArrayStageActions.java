package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetOneDimArrayStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All One Dimensions Arrays";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getArraysStage());
    }
}
