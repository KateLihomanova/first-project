package practice_9.task3_thread;

public class task3_thread implements Runnable {
    private volatile boolean stop = false;
    private int counter = 0;

    @Override
    public void run() {
        while (!stop) {
            counter++;
        }

    }

    public void stop() {
        this.stop = true;
    }

    public int getCounter() {
        return counter;
    }
}
