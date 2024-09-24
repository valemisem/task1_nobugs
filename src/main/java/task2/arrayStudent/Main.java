package task2.arrayStudent;

public class Main {
    public static void main(String[] args) {
        arrayStudent student1 = new arrayStudent("1", "Valentina");
        arrayStudent student2 = new arrayStudent("2", "Ivan");
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.printStudents();
        System.out.println("Remove a student by ID");
        studentManager.removeStudentById("2");
        studentManager.printStudents();
    }
}
