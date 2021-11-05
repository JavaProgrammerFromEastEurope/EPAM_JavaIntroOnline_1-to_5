package chapters.chapterClasses.entitys.common.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class StudentCollection {

    public final List<Student> studentList;

    public StudentCollection() {
        studentList = new ArrayList<>();
    }

    public static void averageMarkGroup(List<Student> studentList, int score) {
        out.println(format("----List of student with average exams score >= {0}----", score));

        Map<Boolean, List<Student>> studentListByValue = studentList.stream()
                .collect(Collectors.partitioningBy(s -> s.getPersonAverageScore() >= score));

        studentListByValue.forEach((k, v) ->
                out.printf("Key:%s  %s%n", k, v.stream()
                                .map(Person::toListString)
                                .collect(Collectors.joining(","))));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return studentList.toString();
    }
}