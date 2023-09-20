package application.actions.stages.chapters.chapterFunctions.algorithmization;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.controllers.impl.FunctionsFactory;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseAlgorithmAction {

    public final Map<Integer, IFunctionController> algorithmActions;

    public BaseAlgorithmAction() {
        this.algorithmActions = FunctionsFactory.getInstance().getAlgorithmControllers();
    }
}