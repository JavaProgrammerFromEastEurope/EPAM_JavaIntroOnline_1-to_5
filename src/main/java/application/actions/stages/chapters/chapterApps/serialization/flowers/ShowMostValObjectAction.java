package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class ShowMostValObjectAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Show Most Valuable Flower";
    }

    @Override
    public void action() {
        appsControllers.get(3).makeSixthAction();
    }
}