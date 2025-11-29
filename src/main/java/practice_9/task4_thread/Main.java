package practice_9.task4_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        task4_Counter task4 = new task4_Counter();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                task4.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                task4.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Значение count: " + task4.getCount());
    }
}
