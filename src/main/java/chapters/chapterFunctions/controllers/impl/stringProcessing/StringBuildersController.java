package chapters.chapterFunctions.controllers.impl.stringProcessing;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;
import java.util.Map;

import static receiver.Receiver.communicationBridge;

public class StringBuildersController implements IFunctionController {

    private final Map<Integer, IFunction> buildFunctions;

    public StringBuildersController() {
        buildFunctions = FunctionFactory.getInstance().getBuildFunctions();
    }

    @Override
    public void calcFirstFunction() {
        buildFunctions.get(1).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        buildFunctions.get(2).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        buildFunctions.get(3).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(3).getResultString());
    }

    public void calcFourthFunction() {
        buildFunctions.get(4).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(4).getResultString());
    }

    public void calcFifthFunction() {
        buildFunctions.get(5).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(5).getResultString());
    }

    public void calcSixthFunction() {
        buildFunctions.get(6).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(6).getResultString());
    }

    public void calcSeventhFunction() {
        buildFunctions.get(7).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(7).getResultString());
    }

    public void calcEighthFunction() {
        buildFunctions.get(8).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(8).getResultString());
    }

    public void calcNinthFunction() {
        buildFunctions.get(9).calcFunction();
          communicationBridge.sendString(
               buildFunctions.get(9).getResultString());
    }

    public void calcTenthFunction() {
        buildFunctions.get(10).calcFunction();
           communicationBridge.sendString(
                buildFunctions.get(10).getResultString());
    }
}
