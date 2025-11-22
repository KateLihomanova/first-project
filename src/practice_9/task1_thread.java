package practice_9;

public class task1_thread {
    public static void main(String[] args) {
        Thread message = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        message.start();
    }
}
