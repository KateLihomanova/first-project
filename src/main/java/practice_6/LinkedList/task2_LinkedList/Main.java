package practice_6.LinkedList.task2_LinkedList;

public class Main {
    public static void main(String[] args) {
        task2_LinkedList task2 = new task2_LinkedList();
        task2.addTasks("Task1");
        task2.addTasks("Task2");
        task2.addTasks("Task3");

        task2.takeTaskToWork();

        task2.printTasks();
    }
}
