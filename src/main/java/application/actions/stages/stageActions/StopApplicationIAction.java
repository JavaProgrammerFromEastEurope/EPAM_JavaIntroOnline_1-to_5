package application.actions.stages.stageActions;

import application.actions.IAction;
import application.exceptions.StopApplicationException;
import receiver.Receiver;

public class StopApplicationIAction implements IAction {

    @Override
    public String description() {
        return "Exit From Application";
    }

    @Override
    public void action() throws StopApplicationException {
        Receiver.communicationBridge.disconnect();
        throw new StopApplicationException();
    }
}
