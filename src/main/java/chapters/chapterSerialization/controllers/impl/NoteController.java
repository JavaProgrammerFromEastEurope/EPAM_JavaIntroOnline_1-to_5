package chapters.chapterSerialization.controllers.impl;

import chapters.chapterSerialization.actions.ActionsFactory;
import chapters.chapterSerialization.actions.IActionTemplate;
import chapters.chapterSerialization.controllers.IApplicationController;

import java.util.HashMap;

public class NoteController implements IApplicationController {

    private final HashMap<Integer, IActionTemplate> appsActions;

    public NoteController() {
        this.appsActions = ActionsFactory.getInstance().getAppsActions();
    }

    @Override
    public void makeFirstAction() {
        appsActions.get(1).addObject();
    }

    @Override
    public void makeSecondAction() {
        appsActions.get(1).updateObject();
    }

    @Override
    public void makeThirdAction() {
        appsActions.get(1).firstSort();
    }

    @Override
    public void makeFourthAction() {
        appsActions.get(1).secondSort();
    }

    @Override
    public void makeFifthAction() {
        appsActions.get(1).removeObject();
    }
}