package chapters.chapterFunctions.controllers.impl.algorithmization;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;
import java.util.Map;

import static receiver.Receiver.communicationBridge;

public class MatrixArrayController implements IFunctionController {

    private final Map<Integer, IFunction> matrixFunctions;

    public MatrixArrayController() {
        matrixFunctions = FunctionFactory.getInstance().getMatrixFunctions();
    }

    @Override
    public void calcFirstFunction() {
        matrixFunctions.get(1).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        matrixFunctions.get(2).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        matrixFunctions.get(3).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(3).getResultString());
    }


    public void calcFourthFunction() {
        matrixFunctions.get(4).inputVariables(
                1, true, false);
        matrixFunctions.get(4).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(4).getResultString());
    }


    public void calcFifthFunction() {
        matrixFunctions.get(5).inputVariables(
                1, true, false);
        matrixFunctions.get(5).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
        matrixFunctions.get(6).inputVariables(
                1, true, false);
        matrixFunctions.get(6).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(6).getResultString());
    }

    public void calcSeventhFunction() {
        matrixFunctions.get(7).inputVariables(
                1, false, false);
        matrixFunctions.get(7).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(7).getResultString());
    }

    public void calcEighthFunction() {
        matrixFunctions.get(8).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(8).getResultString());
    }

    public void calcNinthFunction() {
        matrixFunctions.get(9).inputVariables(
                2, false, false);
        matrixFunctions.get(9).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(9).getResultString());
    }

    public void calcTenthFunction() {
        matrixFunctions.get(10).inputVariables(
                1, false, false);
        matrixFunctions.get(10).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(10).getResultString());
    }

    public void calcEleventhFunction() {
        matrixFunctions.get(11).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(11).getResultString());
    }

    public void calcTwelfthFunction() {
        matrixFunctions.get(12).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(12).getResultString());
    }

    public void calcThirteenthFunction() {
        matrixFunctions.get(13).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(13).getResultString());
    }

    public void calcFourteenthFunction() {
        matrixFunctions.get(14).inputVariables(
                2, false, false);
        matrixFunctions.get(14).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(14).getResultString());
    }

    public void calcFifteenthFunction() {
        matrixFunctions.get(15).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(15).getResultString());
    }

    public void calcSixteenthFunction() {
        matrixFunctions.get(16).inputVariables(
                1, false, false);
        matrixFunctions.get(16).calcFunction();
            communicationBridge.sendString(
                matrixFunctions.get(16).getResultString());
    }
}