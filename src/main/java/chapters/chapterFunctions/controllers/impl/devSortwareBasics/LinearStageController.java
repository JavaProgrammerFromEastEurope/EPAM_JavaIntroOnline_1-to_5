package chapters.chapterFunctions.controllers.impl.devSortwareBasics;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;

import static receiver.Receiver.communicationBridge;

public class LinearStageController implements IFunctionController {

    private final HashMap<Integer, IFunction> lineFunctions;

    public LinearStageController() {
        lineFunctions = FunctionFactory.getInstance().getLineFunctions();
    }

    @Override
    public void calcFirstFunction() {
        lineFunctions.get(1).inputVariables(
                3, false, true);
        lineFunctions.get(1).calcFunction();
         communicationBridge.sendString(
               lineFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        lineFunctions.get(2).inputVariables(
                3, false, true);
        lineFunctions.get(2).calcFunction();
         communicationBridge.sendString(
               lineFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        lineFunctions.get(3).inputVariables(
                2, false, true);
        lineFunctions.get(3).calcFunction();
         communicationBridge.sendString(
               lineFunctions.get(3).getResultString());
    }

    public void calcFourthFunction() {
        lineFunctions.get(4).inputVariables(
                1, false, true);
         communicationBridge.sendString(
               lineFunctions.get(4).getResultString());
    }

    public void calcFifthFunction() {
        lineFunctions.get(5).inputVariables(
                1, false, false);
        lineFunctions.get(5).calcFunction();
         communicationBridge.sendString(
               lineFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
        lineFunctions.get(6).calcFunction();
         communicationBridge.sendString(
               lineFunctions.get(6).getResultString());
    }
}