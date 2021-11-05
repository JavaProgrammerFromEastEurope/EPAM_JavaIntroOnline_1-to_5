package application;

import application.actions.IAction;
import application.actions.stages.StageActionFactory;
import application.exceptions.StopApplicationException;
import application.exceptions.WrongStageException;

import static application.actions.stages.StageActionFactory.*;
import static application.utils.Input.anyIntInitialize;
import static java.lang.System.out;

public class Application {

    static final StageActionFactory stageFactory = getInstance();

    public static void startEntertainment() {
        out.println("Welcome! Entertainment has become!");
        actionStages();
    }

    private static void actionStages() {
        stageFactory.setDefaultStage();
        while (true) try {
            getActionStage().action();
        } catch (StopApplicationException e) {
            break;
        }
    }

    private static IAction getActionStage() {
        stageFactory.showStageMenu();
        int index = anyIntInitialize();
        try {
            return stageFactory.getActionStage(index);
        } catch (WrongStageException e) {
            out.println(e.getMessage());
        }
        return getActionStage();
    }
}