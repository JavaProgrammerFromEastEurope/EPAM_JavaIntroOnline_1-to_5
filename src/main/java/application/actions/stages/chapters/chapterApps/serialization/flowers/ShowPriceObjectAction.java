package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class ShowPriceObjectAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Show a Flower With Inputted Price";
    }

    @Override
    public void action() {
        appsControllers.get(3).makeSeventhAction();
    }
}