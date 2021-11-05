package chapters.chapterClasses.entitys.common.student;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

import static java.text.MessageFormat.format;

public class Exam {

    private String subjectName;
    private int score;
    private Calendar examDate;

    Exam() {
        this.subjectName = "not indicated!";
        this.score = 0;
        this.examDate = new GregorianCalendar();
    }

    public Exam(String subjectName, int score, GregorianCalendar examDate) {
        if (subjectName == null || examDate == null)
            throw new NullPointerException();
        this.subjectName = subjectName;
        this.score = score;
        this.examDate = examDate;
    }

    void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    void setScore(int Score) {
        this.score = Score;
    }

    void setExamDate(Calendar examDate) {
        this.examDate = examDate;
    }

    int getScore() {
        return score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Calendar getExamDate() {
        return examDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Exam exam = (Exam) o;
        return score == exam.score
                && Objects.equals(subjectName, exam.subjectName)
                && Objects.equals(examDate, exam.examDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjectName, score, examDate);
    }

    public String toString() {
        return format("{0} {1} {2}", subjectName, score, examDate.getTime());
    }
}