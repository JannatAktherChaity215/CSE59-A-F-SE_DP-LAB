
class Patient{
    String name;
    String id;
    Patient(String name,String id){
        this.name=name;
        this.id=id;
    }
}
class IdValidator{
    boolean validator(String id){
        return id.length()==10 || id.length()==17;
    }

    }
    class SmsService{
        void  sendSMS(Patient p){
            System.out.println(
            "SMS sent to "+p.name
        );

        }
    }
    public class Main3{
        public static void main(String[] args){


Patient p =
new Patient("John","1234567890");

IdValidator v =
new IdValidator();

if (v.validator(p.id)){

    SmsService sms =
   new SmsService();
    sms.sendSMS(p);
}
    }
}
