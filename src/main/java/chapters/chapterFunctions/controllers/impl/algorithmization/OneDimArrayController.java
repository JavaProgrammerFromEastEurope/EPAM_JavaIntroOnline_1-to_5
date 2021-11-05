package chapters.chapterFunctions.controllers.impl.algorithmization;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;

import static receiver.Receiver.communicationBridge;

public class OneDimArrayController implements IFunctionController {

    private final HashMap<Integer, IFunction> arraysFunctions;

    public OneDimArrayController() {
        arraysFunctions = FunctionFactory.getInstance().getArraysFunctions();
    }

    @Override
    public void calcFirstFunction() {
         arraysFunctions.get(1).inputVariables(
                2,false,false);
         arraysFunctions.get(1).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
         arraysFunctions.get(2).inputVariables(
                2, false, false);
         arraysFunctions.get(2).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
         arraysFunctions.get(3).inputVariables(
                1, false, false);
         arraysFunctions.get(3).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(3).getResultString());
    }


    public void calcFourthFunction() {
         arraysFunctions.get(4).inputVariables(
                1, false, false);
         arraysFunctions.get(4).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(4).getResultString());
    }


    public void calcFifthFunction() {
         arraysFunctions.get(5).inputVariables(
                1, false, false);
         arraysFunctions.get(5).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
         arraysFunctions.get(6).inputVariables(
                1, false, false);
         arraysFunctions.get(6).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(6).getResultString());
    }

    public void calcSeventhFunction() {
         arraysFunctions.get(7).inputVariables(
                1, false, false);
         arraysFunctions.get(7).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(7).getResultString());
    }

    public void calcEighthFunction() {
         arraysFunctions.get(8).inputVariables(
                1, false, false);
         arraysFunctions.get(8).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(8).getResultString());
    }

    public void calcNinthFunction() {
         arraysFunctions.get(9).inputVariables(
                1, false, false);
         arraysFunctions.get(9).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(9).getResultString());
    }

    public void calcTenthFunction() {
        arraysFunctions.get(10).inputVariables(
                1, false, false);
        arraysFunctions.get(10).calcFunction();
            communicationBridge.sendString(
                arraysFunctions.get(10).getResultString());
    }
}