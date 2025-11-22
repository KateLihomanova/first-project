package practice_9.task4_thread;

public class task4_Counter {
    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized int getCount() {
        return this.count;
    }
}
