package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class UpdateFlObjectAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Update Object Action";
    }

    @Override
    public void action() {
        appsControllers.get(3).makeSecondAction();
    }
}