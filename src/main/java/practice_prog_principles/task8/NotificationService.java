package practice_prog_principles.task8;

public class NotificationService {
    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.sendMessage(message);
    }
}
