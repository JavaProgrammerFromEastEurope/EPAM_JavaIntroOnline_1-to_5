package application.actions.stages.chapters.chapterFunctions.stringProcessing;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.controllers.impl.FunctionsFactory;

import java.util.HashMap;

public abstract class BaseStringProcAction {

    public final HashMap<Integer, IFunctionController> strProcActions;

    public BaseStringProcAction() {
        this.strProcActions = FunctionsFactory.getInstance().getStrProcControllers();
    }
}