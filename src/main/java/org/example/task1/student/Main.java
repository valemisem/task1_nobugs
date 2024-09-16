package org.example.task1.student;

public class Main {
    public static void main(String[] args) {
        student student_test = new student();
        student_test.setStudentName("Valentina");
        student_test.setStudentGradeBookNumber(1);
        student_test.setStudentAverageScore(5.0);
        student_test.print();
    }
}
