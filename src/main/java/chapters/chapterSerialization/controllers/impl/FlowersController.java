package chapters.chapterSerialization.controllers.impl;

import chapters.chapterSerialization.actions.ActionsFactory;
import chapters.chapterSerialization.actions.IActionTemplate;
import chapters.chapterSerialization.controllers.IApplicationController;

import java.util.HashMap;

public class FlowersController implements IApplicationController {

    private final HashMap<Integer, IActionTemplate> appsActions;

    public FlowersController() {
        this.appsActions = ActionsFactory.getInstance().getAppsActions();
    }

    @Override
    public void makeFirstAction() {
        appsActions.get(3).addObject();
    }

    @Override
    public void makeSecondAction() {
        appsActions.get(3).updateObject();
    }

    @Override
    public void makeThirdAction() {
        appsActions.get(3).firstSort();
    }

    @Override
    public void makeFourthAction() {
        appsActions.get(3).secondSort();
    }

    @Override
    public void makeFifthAction() {
        appsActions.get(3).removeObject();
    }

    @Override
    public void makeSixthAction() {
        appsActions.get(3).showMostValObject();
    }

    @Override
    public void makeSeventhAction() {
        appsActions.get(3).showPriseObject();
    }

    @Override
    public void makeEighthAction() {
        appsActions.get(3).xmlExportObject();
    }
}