package chapters.chapterFunctions.controllers.impl.stringProcessing;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;

import static receiver.Receiver.communicationBridge;

public class StringsController implements IFunctionController {

    private final HashMap<Integer, IFunction> stringFunctions;

    public StringsController() {
        stringFunctions = FunctionFactory.getInstance().getStringFunctions();
    }

    @Override
    public void calcFirstFunction() {
        stringFunctions.get(1).calcFunction();
           communicationBridge.sendString(
               stringFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        stringFunctions.get(2).calcFunction();
           communicationBridge.sendString(
               stringFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        stringFunctions.get(3).calcFunction();
           communicationBridge.sendString(
               stringFunctions.get(3).getResultString());
    }

    public void calcFourthFunction() {
        stringFunctions.get(4).calcFunction();
           communicationBridge.sendString(
               stringFunctions.get(4).getResultString());
    }

    public void calcFifthFunction() {
        stringFunctions.get(5).calcFunction();
           communicationBridge.sendString(
               stringFunctions.get(5).getResultString());
    }
}
