package application.actions.stages.chapters.chapterApps.serialization.treasures;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class XmlExportTrObjectAction extends BaseAppsAction implements IAction, Runnable {

    @Override
    public String description() {
        return "Export Data to XML File";
    }

    @Override
    public void action() {
        Thread thread = new Thread(this, "XmlExportTreasureThread");
        thread.start();
    }

    @Override
    public void run() {
        appsControllers.get(2).makeEighthAction();
    }
}
