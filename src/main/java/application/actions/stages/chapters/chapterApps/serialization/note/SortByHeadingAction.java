package application.actions.stages.chapters.chapterApps.serialization.note;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByHeadingAction extends BaseAppsAction implements IAction {

    @Override
    public String description() {
        return "Sort By 'Heading' - Field Action:";
    }

    @Override
    public void action() {
        appsControllers.get(1).makeFourthAction();
    }
}