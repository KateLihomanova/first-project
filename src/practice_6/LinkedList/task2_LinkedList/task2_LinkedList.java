package practice_6.LinkedList.task2_LinkedList;

import java.util.LinkedList;

public class task2_LinkedList {
    private LinkedList<String> myTasks;

    public task2_LinkedList() {

        this.myTasks = new LinkedList<>();
    }

    public void addTasks(String newTask) {
        myTasks.addLast(newTask);
    }

    public String takeTaskToWork() {
        return myTasks.poll();
    }

    public void printTasks() {
        System.out.println(myTasks);
    }



}
