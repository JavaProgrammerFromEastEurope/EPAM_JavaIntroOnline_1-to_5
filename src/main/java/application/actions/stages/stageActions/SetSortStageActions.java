package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetSortStageActions implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show All Sorted Arrays";
    }

    @Override
    public void action()  {
        stageFactory.setCurrentStage(stageFactory.getSortStage());
    }
}
