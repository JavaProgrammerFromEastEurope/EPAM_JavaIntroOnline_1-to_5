package chapters.chapterSerialization.projects.notes.dao.serializable;

import chapters.chapterSerialization.projects.notes.dao.IItem;
import chapters.chapterSerialization.projects.notes.entity.Note;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

@SuppressWarnings("unchecked")
public class SerializableItem implements IItem {
    private static final String PATH = "notes/notes.bin";

    @Override
    public List<Note> get() {
        try (InputStream stream = getClass().getResourceAsStream(format("/%s", PATH))) {
            var ios = new ObjectInputStream(stream);
            return (List<Note>) ios.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void save(List<Note> notes) {
        try {
            var classLoader = getClass().getClassLoader();
            var file = new File(Objects.requireNonNull(classLoader.getResource(PATH)).getFile());
            var oos  = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(notes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}