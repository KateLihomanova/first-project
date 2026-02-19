package practice_prog_principles.task8;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка email: " + message);
    }
}
