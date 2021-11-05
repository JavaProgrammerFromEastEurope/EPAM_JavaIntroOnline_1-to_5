package application.actions.stages.chapters.chapterApps.serialization.flowers;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.BaseAppsAction;

public class XmlExportFlObjectAction extends BaseAppsAction implements IAction, Runnable {

    @Override
    public String description() {
        return "Export Data to XML File";
    }

    @Override
    public void action() {
        Thread thread = new Thread(this, "XmlExportItemThread");
        thread.start();
    }

    @Override
    public void run() {
        appsControllers.get(3).makeEighthAction();
    }
}
