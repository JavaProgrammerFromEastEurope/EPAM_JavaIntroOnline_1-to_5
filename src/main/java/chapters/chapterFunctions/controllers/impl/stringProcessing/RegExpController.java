package chapters.chapterFunctions.controllers.impl.stringProcessing;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;
import java.util.Map;

import static receiver.Receiver.communicationBridge;

public class RegExpController implements IFunctionController {

    private final Map<Integer, IFunction> regExpFunctions;

    public RegExpController() {
        regExpFunctions = FunctionFactory.getInstance().getRegExpFunctions();
    }

    @Override
    public void calcFirstFunction() {
        regExpFunctions.get(1).calcFunction();
           communicationBridge.sendString(
               regExpFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        regExpFunctions.get(2).calcFunction();
           communicationBridge.sendString(
               regExpFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        regExpFunctions.get(3).calcFunction();
           communicationBridge.sendString(
               regExpFunctions.get(3).getResultString());
    }
}