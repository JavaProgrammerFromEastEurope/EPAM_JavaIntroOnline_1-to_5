package application.actions.stages.chapters.chapterApps.serialization.note;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class UpdateObjectAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Update Object Action:";
    }

    @Override
    public void action() {
        appsControllers.get(1).makeSecondAction();
    }
}
