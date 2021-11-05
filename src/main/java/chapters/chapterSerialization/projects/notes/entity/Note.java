package chapters.chapterSerialization.projects.notes.entity;
import java.io.Serializable;
import java.util.Objects;

public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String to;
    private String from;
    private String heading;
    private String body;

    public Note(){}

    public Note(String to, String from, String heading, String body) {
        this.to     = to;
        this.from   = from;
        this.heading = heading;
        this.body   = body;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return id == note.id && Objects.equals(to, note.to)
                && Objects.equals(from, note.from)
                && Objects.equals(heading, note.heading)
                && Objects.equals(body, note.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, to, from, heading, body);
    }

    @Override
    public String toString() {
        return String.format(
                "{id=%d, to='%s', from='%s'," +
                        " heading='%s', body='%s'}",
                id, to, from, heading, body);
    }
}