package org.example.task1.student;

public class student implements Printable {
    private String studentName;
    private int studentGradeBookNumber;
    private double studentAverageScore;

    public void setStudentName(String setStudentName){
        this.studentName = setStudentName;
    }

    public void setStudentGradeBookNumber(int studentGradeBookNumber){
        this.studentGradeBookNumber = studentGradeBookNumber;
    }

    public void setStudentAverageScore(double studentAverageScore) {
        this.studentAverageScore = studentAverageScore;
    }

    @Override
    public void print() {
        System.out.println(studentName + "\n" + studentGradeBookNumber + "\n" + studentAverageScore);
    }

}
