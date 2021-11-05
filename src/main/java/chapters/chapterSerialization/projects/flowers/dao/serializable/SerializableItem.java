package chapters.chapterSerialization.projects.flowers.dao.serializable;

import chapters.chapterSerialization.projects.flowers.dao.IItem;
import chapters.chapterSerialization.projects.flowers.entity.FlowerComposition;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

@SuppressWarnings("unchecked")
public class SerializableItem implements IItem {
    private static final String PATH = "flowers/flowers.bin";

    @Override
    public List<FlowerComposition> get() {
        try (InputStream stream = getClass().getResourceAsStream(format("/%s", PATH))) {
            var ios = new ObjectInputStream(stream);
            return (List<FlowerComposition>) ios.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void save(List<FlowerComposition> flowerCompositions) {
        try {
            var classLoader = getClass().getClassLoader();
            var file = new File(Objects.requireNonNull(classLoader.getResource(PATH)).getFile());
            var oos  = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(flowerCompositions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}