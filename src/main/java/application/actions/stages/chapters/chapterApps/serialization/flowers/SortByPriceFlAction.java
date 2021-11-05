package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByPriceFlAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Sorting by price flower";
    }

    @Override
    public void action() {
        appsControllers.get(3).makeFourthAction();
        stageFactory.setCurrentStage(stageFactory.getFlowerStage());
    }
}