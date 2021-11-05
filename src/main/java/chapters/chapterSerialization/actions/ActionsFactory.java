package chapters.chapterSerialization.actions;

import chapters.chapterSerialization.actions.impl.FlowerActions;
import chapters.chapterSerialization.actions.impl.NoteActions;
import chapters.chapterSerialization.actions.impl.TreasureActions;

import java.util.HashMap;

public class ActionsFactory {

    private final HashMap<Integer, IActionTemplate> AppsActions = new HashMap<>();

    private static final ActionsFactory instance = new ActionsFactory();

    private ActionsFactory(){
        AppsActions.put(1, new NoteActions());
        AppsActions.put(2, new TreasureActions());
        AppsActions.put(3, new FlowerActions());
    }

    public static ActionsFactory getInstance() {
        return instance;
    }

    public HashMap<Integer, IActionTemplate> getAppsActions() {
        return AppsActions;
    }
}