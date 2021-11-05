package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetTreasureStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Run Treasure Application";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getTreasureStage());
    }
}