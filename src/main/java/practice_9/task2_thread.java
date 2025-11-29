package practice_9;

public class task2_thread {
    public static void main(String[] args) throws InterruptedException {
        Thread char1 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });
        Thread char2 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        char1.start();
        char2.start();
        char1.join();
        char2.join();
    }
}
