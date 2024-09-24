package task2.arrayStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<arrayStudent> studentList = new ArrayList<>();

    public void addStudent(arrayStudent student) {
        studentList.add(student);
    }

    public void removeStudent(arrayStudent student) {
        studentList.remove(student);
    }

    public void removeStudentById(String studentId) {
        for (arrayStudent student : studentList) {
            if (student.getId().equals(studentId)) {
                studentList.remove(student);
                break;
            }
        }
    }

    public void printStudents() {
        for (arrayStudent student : studentList) {
            System.out.println(student);
        }
    }
}
