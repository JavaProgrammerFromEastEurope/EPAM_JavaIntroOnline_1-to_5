package chapters.chapterSerialization.projects.flowers.entity.factorys;

import chapters.chapterSerialization.projects.flowers.entity.Flower;
import chapters.chapterSerialization.projects.flowers.entity.flowers.*;

import java.util.HashMap;

public class FlowerFactory {

    private final HashMap<Integer, Flower> flowers = new HashMap<>();

    public static FlowerFactory instance = new FlowerFactory();

    private FlowerFactory() {
        flowers.put(1, new Alstroemeria("Alstroemeria"));
        flowers.put(2, new Chrysanthemum("Chrysanthemum"));
        flowers.put(3, new Lily("Lily"));
        flowers.put(4, new Rose("Rose"));
        flowers.put(5, new Tulip("Tulip"));
    }

    public Flower valueOf(int i) {
        switch (i) {
            case 1:
                return flowers.get(1);
            case 2:
                return flowers.get(2);
            case 3:
                return flowers.get(3);
            case 4:
                return flowers.get(4);
            case 5:
                return flowers.get(5);
        }
        return flowers.get(4);
    }

    public static FlowerFactory getInstance() {
        return instance;
    }
}
