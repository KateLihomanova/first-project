package practice_9.task3_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        task3_thread task3 = new task3_thread();
        Thread t3 = new Thread(task3);
        t3.start();
        Thread.sleep(2000);
        task3.stop();

        System.out.println("Значение count: " + task3.getCounter());
    }
}
