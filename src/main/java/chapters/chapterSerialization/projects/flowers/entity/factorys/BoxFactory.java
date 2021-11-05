package chapters.chapterSerialization.projects.flowers.entity.factorys;

import chapters.chapterSerialization.projects.flowers.entity.Box;
import chapters.chapterSerialization.projects.flowers.entity.boxes.Basket;
import chapters.chapterSerialization.projects.flowers.entity.boxes.Bouquet;
import chapters.chapterSerialization.projects.flowers.entity.boxes.Package;

import java.util.HashMap;

public class BoxFactory {

    private final HashMap<Integer, Box> boxes = new HashMap<>();

    public static BoxFactory instance = new BoxFactory();

    private BoxFactory() {
        boxes.put(1, new Basket("Basket"));
        boxes.put(2, new Bouquet("Bouquet"));
        boxes.put(3, new Package("Package"));
    }

    public Box valueOf(int i) {
        switch (i) {
            case 1:
                return boxes.get(1);
            case 2:
                return boxes.get(2);
            case 3:
                return boxes.get(3);
        }
        return boxes.get(2);
    }

    public static BoxFactory getInstance() {
        return instance;
    }
}