package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class AddFlObjectAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
       return "Add New Flower Object";
    }

    @Override
    public void action()  {
        appsControllers.get(3).makeFirstAction();
    }
}
