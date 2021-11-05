package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetDefaultStageActions implements IAction {
    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Return to Main Menu\n";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getDefaultStage());
    }
}
