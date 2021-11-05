package chapters.chapterSerialization.controllers.impl;

import chapters.chapterSerialization.actions.ActionsFactory;
import chapters.chapterSerialization.actions.IActionTemplate;
import chapters.chapterSerialization.controllers.IApplicationController;

import java.util.HashMap;

public class TreasuresController implements IApplicationController {

    private final HashMap<Integer, IActionTemplate> appsActions;

    public TreasuresController() {
        this.appsActions = ActionsFactory.getInstance().getAppsActions();
    }

    @Override
    public void makeFirstAction() {
        appsActions.get(2).addObject();
    }

    @Override
    public void makeSecondAction() {
        appsActions.get(2).updateObject();
    }

    @Override
    public void makeThirdAction() {
        appsActions.get(2).firstSort();
    }

    @Override
    public void makeFourthAction() {
        appsActions.get(2).secondSort();
    }

    @Override
    public void makeFifthAction() {
        appsActions.get(2).removeObject();
    }

    @Override
    public void makeSixthAction() {
        appsActions.get(2).showMostValObject();
    }

    @Override
    public void makeSeventhAction() {
        appsActions.get(2).showPriseObject();
    }

    @Override
    public void makeEighthAction() {
        appsActions.get(2).xmlExportObject();
    }
}