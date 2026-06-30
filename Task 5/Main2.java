
interface MessageSender{
    void sendMessage(String msg);
}
class EmailSender implements MessageSender{
    public void sendMessage(String msg){
    System.out.println("Email: "+msg);

}
}

class SMSender implements MessageSender{

    public void sendMessage(String msg) {
        System.out.println("SMS : "+msg);

        
    }
}

class NotificationService{

MessageSender sender;
NotificationService(MessageSender sender){
    this.sender=sender;

}
void alertUser(String msg){
    sender.sendMessage(msg);
}
}
public class Main2{
    public static void main(String[] args){
        NotificationService n = 
        new NotificationService(new EmailSender());

    n.alertUser("Welcome");
NotificationService s =
        new NotificationService(new SMSender());
        s.alertUser("OTP");

    }
}
