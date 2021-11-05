package application.actions.stages;

import application.actions.IAction;
import application.actions.stages.chapters.chapterApps.serialization.flowers.*;
import application.actions.stages.chapters.chapterApps.serialization.note.*;
import application.actions.stages.chapters.chapterApps.serialization.treasures.*;
import application.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions.*;
import application.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction.*;
import application.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayActions.*;
import application.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayAction.*;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageBranchActions.*;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageCycleActions.*;
import application.actions.stages.chapters.chapterFunctions.devSoftwareBasics.stageLineActions.*;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions.FirstRegExpAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions.SecondRegExpAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions.ThirdRegExpAction;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays.*;
import application.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrBuilder.*;
import application.actions.stages.stageActions.*;
import application.exceptions.WrongStageException;

import java.util.HashMap;

import static java.lang.System.out;

public class StageActionFactory {

    private final HashMap<Integer, IAction> branchStage = new HashMap<>();
    private final HashMap<Integer, IAction> cycleStage  = new HashMap<>();
    private final HashMap<Integer, IAction> lineStage   = new HashMap<>();
    private final HashMap<Integer, IAction> arraysStage = new HashMap<>();
    private final HashMap<Integer, IAction> matrixStage = new HashMap<>();
    private final HashMap<Integer, IAction> sortStage   = new HashMap<>();
    private final HashMap<Integer, IAction> decStage    = new HashMap<>();
    private final HashMap<Integer, IAction> stringStage = new HashMap<>();
    private final HashMap<Integer, IAction> buildStage  = new HashMap<>();
    private final HashMap<Integer, IAction> regExpStage = new HashMap<>();

    private final HashMap<Integer, IAction> notesStage  = new HashMap<>();
    private final HashMap<Integer, IAction> flowerStage = new HashMap<>();
    private final HashMap<Integer, IAction> flowersShowStage = new HashMap<>();
    private final HashMap<Integer, IAction> treasureStage = new HashMap<>();
    private final HashMap<Integer, IAction> treasureShowStage = new HashMap<>();

    private final HashMap<Integer, IAction> defaultStage = new HashMap<>();

    private HashMap<Integer, IAction> currentStage = defaultStage;

    private static final StageActionFactory instance = new StageActionFactory();

    private StageActionFactory() {

        branchStage.put(1, new FirstBranchAction());
        branchStage.put(2, new SecondBranchAction());
        branchStage.put(3, new ThirdBranchAction());
        branchStage.put(4, new FourthBranchAction());
        branchStage.put(5, new FifthBranchAction());

        cycleStage.put(1, new FirstCycleAction());
        cycleStage.put(2, new SecondCycleAction());
        cycleStage.put(3, new ThirdCycleAction());
        cycleStage.put(4, new FourthCycleAction());
        cycleStage.put(5, new FifthCycleAction());
        cycleStage.put(6, new SixthCycleAction());
        cycleStage.put(7, new SeventhCycleAction());
        cycleStage.put(8, new EightCycleAction());

        lineStage.put(1, new FirstLineAction());
        lineStage.put(2, new SecondLineAction());
        lineStage.put(3, new ThirdLineAction());
        lineStage.put(4, new FourthLineAction());
        lineStage.put(5, new FifthLineAction());
        lineStage.put(6, new SixthLineAction());

        arraysStage.put(1, new FirstOneDimArrayAction());
        arraysStage.put(2, new SecondOneDimArrayAction());
        arraysStage.put(3, new ThirdOneDimArrayAction());
        arraysStage.put(4, new FourthOneDimArrayAction());
        arraysStage.put(5, new FifthOneDimArrayAction());
        arraysStage.put(6, new SixthOneDimArrayAction());
        arraysStage.put(7, new SeventhOneDimArrayAction());
        arraysStage.put(8, new EightOneDimArrayAction());
        arraysStage.put(9, new NinthOneDimArrayAction());
        arraysStage.put(10, new TenthOneDimArrayAction());

        matrixStage.put(1, new FirstMatrixAction());
        matrixStage.put(2, new SecondMatrixAction());
        matrixStage.put(3, new ThirdMatrixAction());
        matrixStage.put(4, new FourthMatrixAction());
        matrixStage.put(5, new FifthMatrixAction());
        matrixStage.put(6, new SixthMatrixAction());
        matrixStage.put(7, new SeventhMatrixAction());
        matrixStage.put(8, new EighthMatrixAction());
        matrixStage.put(9, new NinthMatrixAction());
        matrixStage.put(10, new TenthMatrixAction());
        matrixStage.put(11, new EleventhMatrixAction());
        matrixStage.put(12, new TwelfthMatrixAction());
        matrixStage.put(13, new ThirteenthMatrixAction());
        matrixStage.put(14, new FourteenthMatrixAction());
        matrixStage.put(15, new FifteenMatrixAction());
        matrixStage.put(16, new SixteenthMatrixAction());

        sortStage.put(1, new FirstSortArrayAction());
        sortStage.put(2, new SecondSortArrayAction());
        sortStage.put(3, new ThirdSortedArrayAction());
        sortStage.put(4, new FourthSortArrayAction());
        sortStage.put(5, new FifthSortArrayAction());
        sortStage.put(6, new SixthSortArrayAction());
        sortStage.put(7, new SeventhSortArrayAction());
        sortStage.put(8, new EightSortArrayAction());

        decStage.put(1, new FirstDecAction());
        decStage.put(2, new SecondDecAction());
        decStage.put(3, new ThirdDecAction());
        decStage.put(4, new FourthDecAction());
        decStage.put(5, new FifthDecAction());
        decStage.put(6, new SixthDecAction());
        decStage.put(7, new SeventhDecAction());
        decStage.put(8, new EighthDecAction());
        decStage.put(9, new NinthDecAction());
        decStage.put(10, new TenthDecAction());
        decStage.put(11, new EleventhDecAction());
        decStage.put(12, new TwelfthDecAction());
        decStage.put(13, new ThirteenthDecAction());
        decStage.put(14, new FourteenthDecAction());
        decStage.put(15, new FifteenthDecAction());
        decStage.put(16, new SixteenthDecAction());
        decStage.put(17, new SeventeenthDecAction());

        stringStage.put(1, new FirstStringArrayAction());
        stringStage.put(2, new SecondStringArrayAction());
        stringStage.put(3, new ThirdStringArrayAction());
        stringStage.put(4, new FourthStringArrayAction());
        stringStage.put(5, new FifthStringArrayAction());

        buildStage.put(1, new FirstStrBuilderAction());
        buildStage.put(2, new SecondStrBuilderAction());
        buildStage.put(3, new ThirdStrBuilderAction());
        buildStage.put(4, new FourthStrBuilderAction());
        buildStage.put(5, new FifthStrBuilderAction());
        buildStage.put(6, new SixthStrBuilderAction());
        buildStage.put(7, new SeventhStrBuilderAction());
        buildStage.put(8, new EightStrBuilderAction());
        buildStage.put(9, new NinthStrBuilderAction());
        buildStage.put(10, new TenthStrBuilderAction());

        regExpStage.put(1, new FirstRegExpAction());
        regExpStage.put(2, new SecondRegExpAction());
        regExpStage.put(3, new ThirdRegExpAction());

        notesStage.put(1, new AddObjectAction());
        notesStage.put(2, new UpdateObjectAction());
        notesStage.put(3, new SortByFromNameAction());
        notesStage.put(4, new SortByHeadingAction());
        notesStage.put(5, new RemoveObjectAction());

        treasureStage.put(1, new AddTreasureAction());
        treasureStage.put(2, new UpdateTrObjectAction());
        treasureStage.put(4, new RemoveTreasureAction());
        treasureStage.put(5, new ShowMostValTreasureAction());
        treasureStage.put(6, new ShowPriceTreasureAction());
        treasureStage.put(7, new XmlExportTrObjectAction());

        flowerStage.put(1, new AddFlObjectAction());
        flowerStage.put(2, new UpdateFlObjectAction());
        flowerStage.put(4, new RemoveFlObjectAction());
        flowerStage.put(5, new ShowMostValObjectAction());
        flowerStage.put(6, new ShowPriceObjectAction());
        flowerStage.put(7, new XmlExportFlObjectAction());
    }

    public void setDefaultStage() {
        defaultStage.put(1, new SetLinearStageActions());
        defaultStage.put(2, new SetBranchStageActions());
        defaultStage.put(3, new SetCycleStageActions());
        defaultStage.put(4, new SetOneDimArrayStageActions());
        defaultStage.put(5, new SetMatrixStageActions());
        defaultStage.put(6, new SetSortStageActions());
        defaultStage.put(7, new SetDecompositionStages());
        defaultStage.put(8, new SetStringArrayActionActions());
        defaultStage.put(9, new SetStringBuilderStageActions());
        defaultStage.put(10, new SetRegExpStageActions());
        defaultStage.put(11, new SetNoteStageActions());
        defaultStage.put(12, new SetTreasureStageActions());
        defaultStage.put(13, new SetFlowersStageActions());
        this.addDefaultStageAction();
    }

    private void addDefaultStageAction() {
        defaultStage.put(0, new StopApplicationIAction());
            decStage.put(0, new SetDefaultStageActions());
         arraysStage.put(0, new SetDefaultStageActions());
         matrixStage.put(0, new SetDefaultStageActions());
           sortStage.put(0, new SetDefaultStageActions());
         branchStage.put(0, new SetDefaultStageActions());
           lineStage.put(0, new SetDefaultStageActions());
          cycleStage.put(0, new SetDefaultStageActions());

         stringStage.put(0, new SetDefaultStageActions());
          buildStage.put(0, new SetDefaultStageActions());
         regExpStage.put(0, new SetDefaultStageActions());

          notesStage.put(0, new SetDefaultStageActions());

        treasureShowStage.put(0, new SetTreasureStageActions());
        treasureShowStage.put(1, new SortByNameTrAction());
        treasureShowStage.put(2, new SortByPriceTrAction());

        treasureStage.put(0, new SetDefaultStageActions());
        treasureStage.put(3, new SetSortTreasureAction());

        flowersShowStage.put(0, new SetFlowersStageActions());
        flowersShowStage.put(1, new SortByNameFlAction());
        flowersShowStage.put(2, new SortByPriceFlAction());

        flowerStage.put(0, new SetDefaultStageActions());
        flowerStage.put(3, new SetSortFlowersAction());
    }

    public static StageActionFactory getInstance() {
        return instance;
    }

    public IAction getActionStage(int index) throws WrongStageException {
        if (currentStage.containsKey(index)) {
            return currentStage.get(index);
        }
        throw new WrongStageException(index);
    }

    public HashMap<Integer, IAction> getLineStage() {
        return lineStage;
    }

    public HashMap<Integer, IAction> getBranchStage() {
        return branchStage;
    }

    public HashMap<Integer, IAction> getCycleStage() {
        return cycleStage;
    }

    public HashMap<Integer, IAction> getDecomposeStage() {
        return decStage;
    }

    public HashMap<Integer, IAction> getDefaultStage() {
        return defaultStage;
    }

    public HashMap<Integer, IAction> getArraysStage() {
        return arraysStage;
    }

    public HashMap<Integer, IAction> getMatrixStage() {
        return matrixStage;
    }

    public HashMap<Integer, IAction> getSortStage() {
        return sortStage;
    }

    public HashMap<Integer, IAction> getStringStage() {
        return stringStage;
    }

    public HashMap<Integer, IAction> getBuildStage() {
        return buildStage;
    }

    public HashMap<Integer, IAction> getRegExpStage() {
        return regExpStage;
    }

    public HashMap<Integer, IAction> getNotesStage() {
        return notesStage;
    }

    public HashMap<Integer, IAction> getFlowerStage() {
        return flowerStage;
    }

    public HashMap<Integer, IAction> getFlowersShowStage() {
        return flowersShowStage;
    }

    public HashMap<Integer, IAction> getTreasureStage() {
        return treasureStage;
    }

    public HashMap<Integer, IAction> getTreasureShowStage() {
        return treasureShowStage;
    }

    public void setCurrentStage(HashMap<Integer, IAction> stage) {
        currentStage = stage;
    }

    public void showStageMenu() {
        currentStage.forEach((key, value) ->
                out.printf("%d - %s%n", key, value.description()));
        out.println("Choose the action you want:");
    }
}