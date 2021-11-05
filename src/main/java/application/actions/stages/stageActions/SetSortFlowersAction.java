package application.actions.stages.stageActions;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;

public class SetSortFlowersAction implements IAction {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show Flower Items";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getFlowersShowStage());
    }
}