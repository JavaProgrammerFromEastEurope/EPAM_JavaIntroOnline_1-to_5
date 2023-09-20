package chapters.chapterFunctions.controllers.impl;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.controllers.impl.algorithmization.DecompositionController;
import chapters.chapterFunctions.controllers.impl.algorithmization.MatrixArrayController;
import chapters.chapterFunctions.controllers.impl.algorithmization.OneDimArrayController;
import chapters.chapterFunctions.controllers.impl.algorithmization.SortArrayController;
import chapters.chapterFunctions.controllers.impl.devSortwareBasics.BranchStageController;
import chapters.chapterFunctions.controllers.impl.devSortwareBasics.CycleStageController;
import chapters.chapterFunctions.controllers.impl.devSortwareBasics.LinearStageController;
import chapters.chapterFunctions.controllers.impl.stringProcessing.RegExpController;
import chapters.chapterFunctions.controllers.impl.stringProcessing.StringBuildersController;
import chapters.chapterFunctions.controllers.impl.stringProcessing.StringsController;

import java.util.HashMap;
import java.util.Map;

public class FunctionsFactory {

    private final Map<Integer, IFunctionController> algorithmControllers = new HashMap<>();
    private final Map<Integer, IFunctionController> devSoftControllers = new HashMap<>();
    private final Map<Integer, IFunctionController> strProcControllers = new HashMap<>();

    private static final FunctionsFactory instance = new FunctionsFactory();

    private FunctionsFactory() {
        algorithmControllers.put(1, new OneDimArrayController());
        algorithmControllers.put(2, new MatrixArrayController());
        algorithmControllers.put(3, new SortArrayController());
        algorithmControllers.put(4, new DecompositionController());

        devSoftControllers.put(1, new BranchStageController());
        devSoftControllers.put(2, new CycleStageController());
        devSoftControllers.put(3, new LinearStageController());

        strProcControllers.put(1, new StringsController());
        strProcControllers.put(2, new StringBuildersController());
        strProcControllers.put(3, new RegExpController());
    }

    public static FunctionsFactory getInstance() {
        return instance;
    }

    public Map<Integer, IFunctionController> getAlgorithmControllers() {
        return algorithmControllers;
    }

    public Map<Integer, IFunctionController> getDevSoftControllers() {
        return devSoftControllers;
    }

    public Map<Integer, IFunctionController> getStrProcControllers() {
        return strProcControllers;
    }
}