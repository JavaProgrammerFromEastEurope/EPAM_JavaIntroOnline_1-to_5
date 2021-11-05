package chapters.chapterClasses.entitys.oop.directory;

public class TextFile extends File {

    private String textBody;

    public TextFile(String filename, int size) {
        super(filename, size);
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getTextBody() {
        return textBody;
    }


    @Override
    public String toString() {
        return String.format("{textBody='%s'}", textBody);
    }
}