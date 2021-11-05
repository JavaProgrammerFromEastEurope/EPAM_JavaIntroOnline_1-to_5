package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByNameTrAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Sorting by Name Treasure";
    }

    @Override
    public void action() {
        appsControllers.get(2).makeThirdAction();
        stageFactory.setCurrentStage(stageFactory.getTreasureStage());
    }
}
