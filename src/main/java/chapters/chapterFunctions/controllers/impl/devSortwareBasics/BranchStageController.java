package chapters.chapterFunctions.controllers.impl.devSortwareBasics;

import chapters.chapterFunctions.controllers.IFunctionController;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.FunctionFactory;

import java.util.HashMap;

import static receiver.Receiver.communicationBridge;

public class BranchStageController implements IFunctionController {

    private final HashMap<Integer, IFunction> branchFunctions;

    public BranchStageController() {
        branchFunctions = FunctionFactory.getInstance().getBranchFunctions();
    }

    @Override
    public void calcFirstFunction() {
        branchFunctions.get(1).inputVariables(
                2, false,false);
        branchFunctions.get(1).calcFunction();
           communicationBridge.sendString(
               branchFunctions.get(1).getResultString());
    }

    @Override
    public void calcSecondFunction() {
        branchFunctions.get(2).inputVariables(
                4, false,false);
        branchFunctions.get(2).calcFunction();
           communicationBridge.sendString(
               branchFunctions.get(2).getResultString());
    }

    @Override
    public void calcThirdFunction() {
        branchFunctions.get(3).calcFunction();
           communicationBridge.sendString(
               branchFunctions.get(3).getResultString());
    }

    public void calcFourthFunction() {
        branchFunctions.get(4).inputVariables(
                5, false,false);
        branchFunctions.get(4).calcFunction();
           communicationBridge.sendString(
               branchFunctions.get(4).getResultString());
    }

    public void calcFifthFunction() {
        branchFunctions.get(5).inputVariables(
                1, false, false);
        branchFunctions.get(5).calcFunction();
           communicationBridge.sendString(
               branchFunctions.get(5).getResultString());
    }
}