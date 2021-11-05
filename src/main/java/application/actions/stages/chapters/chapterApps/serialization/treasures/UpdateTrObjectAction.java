package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class UpdateTrObjectAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Update Treasure Action";
    }

    @Override
    public void action() {
        appsControllers.get(2).makeSecondAction();
    }
}