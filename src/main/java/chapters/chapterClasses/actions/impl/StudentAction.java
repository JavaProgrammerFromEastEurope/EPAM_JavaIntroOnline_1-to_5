package chapters.chapterClasses.actions.impl;

import chapters.chapterClasses.actions.IClassAction;
import chapters.chapterClasses.entitys.common.student.Exam;
import chapters.chapterClasses.entitys.common.student.Student;
import chapters.chapterClasses.entitys.common.student.StudentCollection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.System.out;

public class StudentAction implements IClassAction {

    StudentCollection studentCollection;
    ArrayList<Exam> firstExam;
    ArrayList<Exam> secondExam;
    Student firstStudent, secondStudent;

    @Override
    public void inputVariables() {
        studentCollection = new StudentCollection();
                firstExam = new ArrayList<>();
               secondExam = new ArrayList<>();

        firstExam.add(new Exam("PL", 10,
                new GregorianCalendar(2021, Calendar.JULY, 10)));
        firstExam.add(new Exam("SAOD", 9,
                new GregorianCalendar(2021, Calendar.JULY, 15)));
        firstExam.add(new Exam("MATH", 9,
                new GregorianCalendar(2021, Calendar.JULY, 20)));
        firstExam.add(new Exam("ENGLISH", 9,
                new GregorianCalendar(2021, Calendar.JULY, 24)));
        firstExam.add(new Exam("PHYSICS", 10,
                new GregorianCalendar(2021, Calendar.JULY, 29)));

        secondExam.add(new Exam("PL", 9,
                new GregorianCalendar(2021, Calendar.JULY, 10)));
        secondExam.add(new Exam("SAOD", 9,
                new GregorianCalendar(2021, Calendar.JULY, 15)));
        secondExam.add(new Exam("MATH", 6,
                new GregorianCalendar(2021, Calendar.JULY, 20)));
        secondExam.add(new Exam("ENGLISH", 7,
                new GregorianCalendar(2021, Calendar.JULY, 24)));
        secondExam.add(new Exam("PHYSICS", 5,
                new GregorianCalendar(2021, Calendar.JULY, 29)));

         firstStudent = new Student("PC ", "Principal",
                new GregorianCalendar(1994, Calendar.JULY, 13),
                    Student.Education.Specialist, 681063);

         secondStudent = new Student("Randy ", "Marsh",
                new GregorianCalendar(1981, Calendar.NOVEMBER, 24),
                    Student.Education.SecondEducation, 681063);

         firstStudent.setExams(firstExam);
        secondStudent.setExams(secondExam);

        studentCollection.getStudentList().add(0, firstStudent);
        studentCollection.getStudentList().add(1, secondStudent);
    }

    @Override
    public void printResult() {
        out.print("\nShow student with average score >= 9:\n");
        StudentCollection.averageMarkGroup(studentCollection.getStudentList(), 9);
    }
}