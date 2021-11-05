package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByPriceTrAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Sorting by Price Treasure";
    }

    @Override
    public void action() {
        appsControllers.get(2).makeFourthAction();
        stageFactory.setCurrentStage(stageFactory.getTreasureStage());
    }
}