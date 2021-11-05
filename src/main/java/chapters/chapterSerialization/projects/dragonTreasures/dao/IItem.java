package chapters.chapterSerialization.projects.dragonTreasures.dao;


import application.exceptions.daoObjects.NotFoundItemException;
import chapters.chapterSerialization.projects.dragonTreasures.entity.Treasure;

import java.util.List;

public interface IItem {

    List<Treasure> get();

    default void add(Treasure newTreasure) {
        List<Treasure> treasures = get();
        for (Treasure treasure : treasures) {
            if (treasure.getId() == newTreasure.getId()) {
                newTreasure.setId(
                        treasures.get(
                        treasures.size() - 1)
                                .getId() + 1);
            }
        }
        treasures.add(newTreasure);
        save(treasures);
    }

    default void update(Treasure newTreasure) throws NotFoundItemException {
        List<Treasure> treasures = get();
        var index = 0;
        for (Treasure treasure : treasures) {
            if (treasure.getId() == newTreasure.getId()) {
                treasures.set(index, newTreasure);
                save(treasures);
                return;
            }
            index++;
        }
        throw new NotFoundItemException(newTreasure.getId());
    }

    default void remove(long id) throws NotFoundItemException {
        List<Treasure> treasures = get();
        for (Treasure treasure : treasures) {
            if (treasure.getId() == id) {
                treasures.remove(treasure);
                save(treasures);
                return;
            }
        }
        throw new NotFoundItemException(id);
    }

    void save(List<Treasure> treasures);
}