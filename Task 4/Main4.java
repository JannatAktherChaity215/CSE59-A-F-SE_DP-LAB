
// Abstraction
interface MessageSender {
    void sendMessage(String message);
}


// Low-level class (Email)
class EmailSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}


// Low-level class (SMS)
class SMSSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


// High-level module
class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String msg) {
        sender.sendMessage(msg);
    }
}


// MAIN CLASS
public class Main {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Hello via Email");

        System.out.println("----");

        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("Hello via SMS");
    }
}
