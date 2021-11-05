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

public class FunctionsFactory {

    private final HashMap<Integer, IFunctionController> algorithmControllers = new HashMap<>();
    private final HashMap<Integer, IFunctionController> devSoftControllers = new HashMap<>();
    private final HashMap<Integer, IFunctionController> strProcControllers = new HashMap<>();

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

    public HashMap<Integer, IFunctionController> getAlgorithmControllers() {
        return algorithmControllers;
    }

    public HashMap<Integer, IFunctionController> getDevSoftControllers() {
        return devSoftControllers;
    }

    public HashMap<Integer, IFunctionController> getStrProcControllers() {
        return strProcControllers;
    }
}