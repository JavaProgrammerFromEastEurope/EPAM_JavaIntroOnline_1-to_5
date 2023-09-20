package chapters.chapterFunctions.controllers.impl.algorithmization;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.Map;

import static receiver.Receiver.communicationBridge;

public class DecompositionController implements IFunctionController {

    private final Map<Integer, IFunction> decFunctions;

    public DecompositionController() {
        decFunctions = FunctionFactory.getInstance().getDecFunctions();
    }

    @Override
    public void calcFirstFunction() {
        decFunctions.get(1).inputVariables(
                2, false, false);
        decFunctions.get(1).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        decFunctions.get(2).inputVariables(
                4, false, false);
        decFunctions.get(2).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(2).getResultString());
    }

    public void calcThirdFunction() {
        decFunctions.get(3).inputVariables(
                1, false, false);
        decFunctions.get(3).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(3).getResultString());
    }

    public void calcFourthFunction() {
        decFunctions.get(4).inputVariables(
                1, false, false);
        decFunctions.get(4).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(4).getResultString());
    }

    public void calcFifthFunction() {
        decFunctions.get(5).inputVariables(
                1, false, false);
        decFunctions.get(5).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
        decFunctions.get(6).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(6).getResultString());
    }

    public void calcSeventhFunction() {
        decFunctions.get(7).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(7).getResultString());
    }

    public void calcEighthFunction() {
        decFunctions.get(8).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(8).getResultString());
    }

    public void calcNinthFunction() {
        decFunctions.get(9).inputVariables(
                4, false, false);
        decFunctions.get(9).calcFunction();
        communicationBridge.sendString(
               decFunctions.get(9).getResultString());
    }

    public void calcTenthFunction() {
        decFunctions.get(10).inputVariables(
                1, false, false);
        decFunctions.get(10).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(10).getResultString());
    }

    public void calcEleventhFunction() {
        decFunctions.get(11).inputVariables(
                2, false, false);
        decFunctions.get(11).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(11).getResultString());
    }

    public void calcTwelfthFunction() {
        decFunctions.get(12).inputVariables(
                2, false, false);
        decFunctions.get(12).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(12).getResultString());
    }

    public void calcThirteenthFunction() {
        decFunctions.get(13).inputVariables(
                1, false, false);
        decFunctions.get(13).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(13).getResultString());
    }

    public void calcFourteenthFunction() {
        decFunctions.get(14).inputVariables(
                1, false, false);
        decFunctions.get(14).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(14).getResultString());
    }

    public void calcFifteenthFunction() {
        decFunctions.get(15).inputVariables(
                1, false, false);
        decFunctions.get(15).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(15).getResultString());
    }

    public void calcSixteenthFunction() {
        decFunctions.get(16).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(16).getResultString());
    }

    public void calcSeventeenthFunction() {
        decFunctions.get(17).inputVariables(
                1, false, false);
        decFunctions.get(17).calcFunction();
         communicationBridge.sendString(
                decFunctions.get(17).getResultString());
    }
}