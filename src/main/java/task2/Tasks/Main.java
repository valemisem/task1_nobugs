package task2.Tasks;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("Task_1", 1);
        Task task2 = new Task("Task_2", 2);
        Task task3 = new Task("Task_3", 3);
        Task task4 = new Task("Task_4", 4);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.sortByPriorityAsc();
        taskManager.print();

        taskManager.deleteTask(task1);
        taskManager.print();
    }
}
