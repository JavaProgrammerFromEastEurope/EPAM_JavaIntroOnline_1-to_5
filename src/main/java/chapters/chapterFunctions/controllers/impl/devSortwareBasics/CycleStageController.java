package chapters.chapterFunctions.controllers.impl.devSortwareBasics;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;
import java.util.Map;

import static receiver.Receiver.communicationBridge;

public class CycleStageController implements IFunctionController {

    private final Map<Integer, IFunction> cycleFunctions;

    public CycleStageController() {
        cycleFunctions = FunctionFactory.getInstance().getCycleFunctions();
    }

    @Override
    public void calcFirstFunction() {
        cycleFunctions.get(1).inputVariables(
                1, false, false);
        cycleFunctions.get(1).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        cycleFunctions.get(2).inputVariables(
                3, false, false);
        cycleFunctions.get(2).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        cycleFunctions.get(3).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(3).getResultString());
    }

    public void calcFourthFunction() {
        cycleFunctions.get(4).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(4).getResultString());
    }

    public void calcFifthFunction() {
        cycleFunctions.get(5).inputVariables(
                1, false, false);
        cycleFunctions.get(5).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
          communicationBridge.sendString(
               cycleFunctions.get(6).getResultString());
    }

    public void calcSeventhFunction() {
        cycleFunctions.get(7).inputVariables(
                2, false, false);
        cycleFunctions.get(7).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(7).getResultString());
    }

    public void calcEighthFunction() {
        cycleFunctions.get(8).inputVariables(
                2, false, false);
        cycleFunctions.get(8).calcFunction();
          communicationBridge.sendString(
               cycleFunctions.get(8).getResultString());
    }
}