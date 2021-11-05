package application.actions.stages.chapters.chapterFunctions.devSoftwareBasics;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.controllers.impl.FunctionsFactory;

import java.util.HashMap;

public abstract class BaseSoftwareAction {

    public final HashMap<Integer, IFunctionController> devSoftwareActions;

    public BaseSoftwareAction() {
        devSoftwareActions = FunctionsFactory.getInstance().getDevSoftControllers();
    }

}