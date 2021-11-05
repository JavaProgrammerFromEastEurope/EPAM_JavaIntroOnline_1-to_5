package application.sortComparator.impl.apps.note;


import application.sortComparator.ISortTemplate;
import chapters.chapterSerialization.projects.notes.entity.Note;

public class SortByFromNote implements ISortTemplate<Note> {

    @Override
    public int compare(Note o1, Note o2) {
        return o1.getFrom().compareTo(o2.getFrom());
    }
}
