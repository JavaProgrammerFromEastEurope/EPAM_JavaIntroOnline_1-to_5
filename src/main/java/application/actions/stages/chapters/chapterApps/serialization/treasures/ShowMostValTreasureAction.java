package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class ShowMostValTreasureAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Show Most Valuable Treasure";
    }

    @Override
    public void action() {
        appsControllers.get(2).makeSixthAction();
    }
}