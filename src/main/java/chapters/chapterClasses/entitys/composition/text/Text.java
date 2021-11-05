package chapters.chapterClasses.entitys.composition.text;

import java.util.List;
import java.util.Objects;

public class Text {

    private String headerOfText;
    private List<Sentence> sentenceList;

    public Text(String headerOfText, List<Sentence> sentenceList) {
        this.headerOfText = headerOfText;
        this.sentenceList = sentenceList;
    }

    public void setHeaderOfText(String headerOfText) {
        this.headerOfText = headerOfText;
    }

    public void setSentenceList(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public String getHeaderOfText() {
        return headerOfText;
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    public void addSentence(Sentence sentence){
        sentenceList.add(sentence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(sentenceList, text.sentenceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentenceList);
    }

    @Override
    public String toString() {
        return sentenceList.toString();
    }
}