package chapters.chapterClasses.entitys.composition.text;

import java.util.List;

public class Sentence {

    private List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return words.toString();
    }
}