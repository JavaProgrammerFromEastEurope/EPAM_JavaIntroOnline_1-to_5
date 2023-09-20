package chapters.chapterFunctions.controllers.impl.algorithmization;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;
import java.util.Map;

import static receiver.Receiver.communicationBridge;

public class SortArrayController implements IFunctionController {

    private final Map<Integer, IFunction> sortFunctions;

    public SortArrayController() {
        sortFunctions = FunctionFactory.getInstance().getSortFunctions();
    }

    @Override
    public void calcFirstFunction() {
        sortFunctions.get(1).inputVariables(
                2, false, false);
        sortFunctions.get(1).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        sortFunctions.get(2).inputVariables(
                2, false, false);
        sortFunctions.get(2).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        sortFunctions.get(3).inputVariables(
                1, false, false);
        sortFunctions.get(3).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(3).getResultString());
    }


    public void calcFourthFunction() {
        sortFunctions.get(4).inputVariables(
                1, false, false);
        sortFunctions.get(4).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(4).getResultString());
    }


    public void calcFifthFunction() {
        sortFunctions.get(5).inputVariables(
                1, false, false);
        sortFunctions.get(5).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
        sortFunctions.get(6).inputVariables(
                1, false, false);
        sortFunctions.get(6).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(6).getResultString());
    }

    public void calcSeventhFunction() {
        sortFunctions.get(7).inputVariables(
                2, false, false);
        sortFunctions.get(7).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(7).getResultString());
    }

    public void calcEighthFunction() {
        sortFunctions.get(8).calcFunction();
         communicationBridge.sendString(
               sortFunctions.get(8).getResultString());
    }
}