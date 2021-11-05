package chapters.chapterSerialization.controllers;

import chapters.chapterSerialization.controllers.impl.FlowersController;
import chapters.chapterSerialization.controllers.impl.NoteController;
import chapters.chapterSerialization.controllers.impl.TreasuresController;

import java.util.HashMap;

public class WithInAppFactory {

    private final HashMap<Integer, IApplicationController> appsControllers = new HashMap<>();

    private static final WithInAppFactory instance = new WithInAppFactory();

    private WithInAppFactory() {
        appsControllers.put(1, new NoteController());
        appsControllers.put(2, new TreasuresController());
        appsControllers.put(3, new FlowersController());
    }

    public static WithInAppFactory getInstance() {
        return instance;
    }

    public HashMap<Integer, IApplicationController> getAppsControllers() {
        return appsControllers;
    }
}