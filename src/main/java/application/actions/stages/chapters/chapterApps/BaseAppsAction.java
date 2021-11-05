package application.actions.stages.chapters.chapterApps;

import application.actions.stages.StageActionFactory;
import chapters.chapterSerialization.controllers.IApplicationController;
import chapters.chapterSerialization.controllers.WithInAppFactory;

import java.util.HashMap;

public abstract class BaseAppsAction {

    protected final HashMap<Integer, IApplicationController> appsControllers;
    protected final StageActionFactory stageFactory = StageActionFactory.getInstance();

    public BaseAppsAction() {
        this.appsControllers = WithInAppFactory.getInstance().getAppsControllers();
    }
}
