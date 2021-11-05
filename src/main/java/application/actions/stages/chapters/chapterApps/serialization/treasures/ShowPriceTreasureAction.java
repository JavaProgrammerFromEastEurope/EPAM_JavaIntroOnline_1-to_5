package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class ShowPriceTreasureAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Show a Treasure With Inputted Price";
    }

    @Override
    public void action() {
        appsControllers.get(2).makeSeventhAction();
    }
}