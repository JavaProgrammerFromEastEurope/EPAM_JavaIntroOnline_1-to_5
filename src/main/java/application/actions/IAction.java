package application.actions;

import application.exceptions.StopApplicationException;

public interface IAction {

    String description();

    void action() throws StopApplicationException;
}
