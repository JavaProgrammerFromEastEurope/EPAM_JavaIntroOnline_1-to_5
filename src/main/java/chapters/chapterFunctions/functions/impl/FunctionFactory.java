package chapters.chapterFunctions.functions.impl;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.decomposition.*;
import chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays.*;
import chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays.*;
import chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays.*;
import chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions.*;
import chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions.*;
import chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions.*;
import chapters.chapterFunctions.functions.impl.stringProcessing.regExpressions.FirstRegExpFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.regExpressions.SecondRegExpFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.regExpressions.ThirdRegExpFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder.*;
import chapters.chapterFunctions.functions.impl.stringProcessing.strings.*;

import java.util.HashMap;

public class FunctionFactory {

    private final HashMap<Integer, IFunction> branchFunctions = new HashMap<>();
    private final HashMap<Integer, IFunction> cycleFunctions  = new HashMap<>();
    private final HashMap<Integer, IFunction> lineFunctions   = new HashMap<>();
    private final HashMap<Integer, IFunction> arraysFunctions = new HashMap<>();
    private final HashMap<Integer, IFunction> matrixFunctions = new HashMap<>();
    private final HashMap<Integer, IFunction> sortFunctions   = new HashMap<>();
    private final HashMap<Integer, IFunction> decFunctions    = new HashMap<>();
    private final HashMap<Integer, IFunction> stringFunctions = new HashMap<>();
    private final HashMap<Integer, IFunction> buildFunctions  = new HashMap<>();
    private final HashMap<Integer, IFunction> regExpFunctions = new HashMap<>();

    private static final FunctionFactory instance = new FunctionFactory();

    private FunctionFactory(){
        branchFunctions.put(1, new FirstBranchFunction());
        branchFunctions.put(2, new SecondBranchFunction());
        branchFunctions.put(3, new ThirdBranchFunction());
        branchFunctions.put(4, new FourthBranchFunction());
        branchFunctions.put(5, new FifthBranchFunction());

        cycleFunctions.put(1, new FirstCycleFunction());
        cycleFunctions.put(2, new SecondCycleFunction());
        cycleFunctions.put(3, new ThirdCycleFunction());
        cycleFunctions.put(4, new FourthCycleFunction());
        cycleFunctions.put(5, new FifthCycleFunction());
        cycleFunctions.put(6, new SixthCycleFunction());
        cycleFunctions.put(7, new SeventhCycleFunction());
        cycleFunctions.put(8, new EightCycleFunction());

        lineFunctions.put(1, new FirstLinearFunction());
        lineFunctions.put(2, new SecondLinearFunction());
        lineFunctions.put(3, new ThirdLinearFunction());
        lineFunctions.put(4, new FourthLinearFunction());
        lineFunctions.put(5, new FifthLinearFunction());
        lineFunctions.put(6, new SixthLinearFunction());

        arraysFunctions.put(1, new FirstOneDimFunction());
        arraysFunctions.put(2, new SecondOneDimFunction());
        arraysFunctions.put(3, new ThirdOneDimFunction());
        arraysFunctions.put(4, new FourthOneDimFunction());
        arraysFunctions.put(5, new FifthOneDimFunction());
        arraysFunctions.put(6, new SixthOneDimFunction());
        arraysFunctions.put(7, new SeventhOneDimFunction());
        arraysFunctions.put(8, new EighthOneDimFunction());
        arraysFunctions.put(9, new NinthOneDimFunction());
        arraysFunctions.put(10, new TenthOneDimFunction());

        matrixFunctions.put(1, new FirstMatrixFunction());
        matrixFunctions.put(2, new SecondMatrixFunction());
        matrixFunctions.put(3, new ThirdMatrixFunction());
        matrixFunctions.put(4, new FourthMatrixFunction());
        matrixFunctions.put(5, new FifthMatrixFunction());
        matrixFunctions.put(6, new SixthMatrixFunction());
        matrixFunctions.put(7, new SeventhMatrixFunction());
        matrixFunctions.put(8, new EightMatrixFunction());
        matrixFunctions.put(9, new NinthMatrixFunction());
        matrixFunctions.put(10, new TenthMatrixFunction());
        matrixFunctions.put(11, new EleventhMatrixFunction());
        matrixFunctions.put(12, new TwelfthMatrixFunction());
        matrixFunctions.put(13, new ThirteenMatrixFunction());
        matrixFunctions.put(14, new FourteenMatrixFunction());
        matrixFunctions.put(15, new FifteenMatrixFunction());
        matrixFunctions.put(16, new SixteenMatrixFunction());

        sortFunctions.put(1, new FirstSortFunction());
        sortFunctions.put(2, new SecondSortFunction());
        sortFunctions.put(3, new ThirdSortFunction());
        sortFunctions.put(4, new FourthSortFunction());
        sortFunctions.put(5, new FifthSortFunction());
        sortFunctions.put(6, new SixthSortFunction());
        sortFunctions.put(7, new SeventhSortFunction());
        sortFunctions.put(8, new EighthSortFunction());

        decFunctions.put(1, new FirstDecFunction());
        decFunctions.put(2, new SecondDecFunction());
        decFunctions.put(3, new ThirdDecFunction());
        decFunctions.put(4, new FourthDecFunction());
        decFunctions.put(5, new FifthDecFunction());
        decFunctions.put(6, new SixthDecFunction());
        decFunctions.put(7, new SeventhDecFunction());
        decFunctions.put(8, new EighthDecFunction());
        decFunctions.put(9, new NinthDecFunction());
        decFunctions.put(10, new TenthDecFunction());
        decFunctions.put(11, new EleventhDecFunction());
        decFunctions.put(12, new TwelfthDecFunction());
        decFunctions.put(13, new ThirteenthDecFunction());
        decFunctions.put(14, new FourteenthDecFunction());
        decFunctions.put(15, new FifteenthDecFunction());
        decFunctions.put(16, new SixteenthDecFunction());
        decFunctions.put(17, new SeventeenthDecFunction());

        stringFunctions.put(1, new FirstStrFunction());
        stringFunctions.put(2, new SecondStrFunction());
        stringFunctions.put(3, new ThirdStrFunction());
        stringFunctions.put(4, new FourthStrFunction());
        stringFunctions.put(5, new FifthStrFunction());

        buildFunctions.put(1, new FirstStrBuilderFunction());
        buildFunctions.put(2, new SecondStrBuilderFunction());
        buildFunctions.put(3, new ThirdStrBuilderFunction());
        buildFunctions.put(4, new FourthStrBuilderFunction());
        buildFunctions.put(5, new FifthStrBuilderFunction());
        buildFunctions.put(6, new SixthStrBuilderFunction());
        buildFunctions.put(7, new SeventhStrBuilderFunction());
        buildFunctions.put(8, new EighthStrBuilderFunction());
        buildFunctions.put(9, new NinthStrBuilderFunction());
        buildFunctions.put(10, new TenthStrBuilderFunction());

        regExpFunctions.put(1, new FirstRegExpFunction());
        regExpFunctions.put(2, new SecondRegExpFunction());
        regExpFunctions.put(3, new ThirdRegExpFunction());
    }

    public static FunctionFactory getInstance() {
        return instance;
    }

    public HashMap<Integer, IFunction> getBranchFunctions() {
        return branchFunctions;
    }

    public HashMap<Integer, IFunction> getCycleFunctions() {
        return cycleFunctions;
    }

    public HashMap<Integer, IFunction> getLineFunctions() {
        return lineFunctions;
    }

    public HashMap<Integer, IFunction> getArraysFunctions() {
        return arraysFunctions;
    }

    public HashMap<Integer, IFunction> getMatrixFunctions() {
        return matrixFunctions;
    }

    public HashMap<Integer, IFunction> getSortFunctions() {
        return sortFunctions;
    }

    public HashMap<Integer, IFunction> getDecFunctions() {
        return decFunctions;
    }

    public HashMap<Integer, IFunction> getStringFunctions() {
        return stringFunctions;
    }

    public HashMap<Integer, IFunction> getBuildFunctions() {
        return buildFunctions;
    }

    public HashMap<Integer, IFunction> getRegExpFunctions() {
        return regExpFunctions;
    }
}