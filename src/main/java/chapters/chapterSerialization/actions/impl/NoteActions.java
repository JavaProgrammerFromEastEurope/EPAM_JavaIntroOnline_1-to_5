package chapters.chapterSerialization.actions.impl;

import application.exceptions.daoObjects.NotFoundItemException;
import application.sortComparator.impl.apps.note.SortByFromNote;
import application.sortComparator.impl.apps.note.SortByHeadingNote;
import application.utils.Input;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterSerialization.actions.IActionTemplate;
import chapters.chapterSerialization.projects.notes.dao.xml.XmlItem;
import chapters.chapterSerialization.projects.notes.entity.Note;

import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;
import static receiver.Receiver.communicationBridge;

public class NoteActions implements IActionTemplate {

    private final XmlItem serializableNotes = new XmlItem();

    private static Note inputNoteObject() {
        String to       = Input.getString("Input To:");
        String from     = Input.getString("Input From:");
        String heading  = Input.getString("Input Heading:");
        String body     = Input.getString("Input body");
        return new Note(to, from, heading, body);
    }

    @Override
    public void addObject() {
        try {
            serializableNotes.add(inputNoteObject());
            out.println("Adding note was successful!");
        } catch (Exception e) {
            communicationBridge.sendString(e.getMessage());
        }
    }

    @Override
    public void updateObject() {
        try {
            var id = (long) Input.getInteger("Input note id to update");
            var flower = inputNoteObject();
            flower.setId(id);
            serializableNotes.update(flower);
            out.println("Updating note was successful!");
        } catch (NotFoundItemException e) {
            communicationBridge.sendString(e.getMessage());
        }
    }

    @Override
    public void removeObject() {
        long id = Input.getInteger("Input note id to remove:");
        try {
            serializableNotes.remove(id);
            out.println("Removing note was successful!");
        } catch (NotFoundItemException e) {
            communicationBridge.sendString(e.getMessage());
        }
    }

    @Override
    public void firstSort() {
        out.println(IFunction.warning);
        List<Note> notes = serializableNotes.get();
        notes.sort(new SortByFromNote());
        communicationBridge.sendString(
                printListItems(notes));
    }

    @Override
    public void secondSort() {
        out.println(IFunction.warning);
        List<Note> notes = serializableNotes.get();
        notes.sort(new SortByHeadingNote());
        communicationBridge.sendString(
                printListItems(notes));
    }

    private String printListItems(List<Note> notes) {
        var resultList = new StringBuilder();
        if (notes.size() == 0) {
            resultList.append("List of notes is empty!");
            return resultList.toString();
        }
        for (var note : notes) {
            resultList.append(format("%s%n", note));
        }
        return resultList.toString();
    }
}