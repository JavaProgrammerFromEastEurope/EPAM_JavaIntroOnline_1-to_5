package chapters.chapterClasses.entitys.common.student;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class Student extends Person {

    public enum Education {
        Specialist, Bachelor, SecondEducation;

        public static Education valueOf(int i) {
            switch (i) {
                case 0:
                    return Specialist;
                case 1:
                    return Bachelor;
                case 2:
                    return SecondEducation;
            }
            return Specialist;
        }
    }

    private final Education education;
    private final int groupNumber;
    private List<Exam> exams = new ArrayList<>();

    public Student(String firstName, String lastName, GregorianCalendar dateOfBirth,
                   Education education, int groupNumber) {
        super(firstName, lastName, dateOfBirth);
        this.education = education;
        this.groupNumber = groupNumber;
    }

    double getPersonAverageScore() {
        double score = 0.0,
               count = 0.0;
        for (Exam exam : exams) {
            score += exam.getScore();
            count++;
        }
        return score / count;
    }

    public void setExams(ArrayList<Exam> params) {
        this.exams = params;
    }

    private void printArray(List<Exam> arrayList) {
        arrayList.forEach(aArray ->
                out.printf("%s | ", aArray.toString()));
    }

    @Override
    public String toString() {
        String string = format("{0} {1} {2} ",
                super.toString(), education, groupNumber);
        out.printf("%s%n%t", string);
        out.println("List of exams:");
        printArray(exams);
        out.println();
        return "";
    }
}