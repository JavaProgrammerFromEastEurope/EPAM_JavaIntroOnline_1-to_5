package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class AddTreasureAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
       return "Add New Treasure";
    }

    @Override
    public void action()  {
        appsControllers.get(2).makeFirstAction();
    }
}
