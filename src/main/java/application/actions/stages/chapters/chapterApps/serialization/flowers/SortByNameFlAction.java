package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByNameFlAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Sorting by Name Flower";
    }

    @Override
    public void action() {
        appsControllers.get(3).makeThirdAction();
        stageFactory.setCurrentStage(stageFactory.getFlowerStage());
    }
}
