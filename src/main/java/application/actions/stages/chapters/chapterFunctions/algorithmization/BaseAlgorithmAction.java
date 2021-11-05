package application.actions.stages.chapters.chapterFunctions.algorithmization;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.controllers.impl.FunctionsFactory;

import java.util.HashMap;

public abstract class BaseAlgorithmAction {

    public final HashMap<Integer, IFunctionController> algorithmActions;

    public BaseAlgorithmAction() {
        this.algorithmActions = FunctionsFactory.getInstance().getAlgorithmControllers();
    }
}