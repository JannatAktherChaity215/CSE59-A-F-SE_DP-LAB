
// Common parent
class TeamMember {
    protected String name;
    public TeamMember(String name) {
        this.name = name;
    }
    public void showName() {
        System.out.println(name);
        
    }
}
// Only bonus eligible people
interface BonusEligible {
    void calculateBonus();
}
// Regular Employee
class Employee extends TeamMember
implements BonusEligible {
    public Employee(String name){
        super(name);
    }
    

public void calculateBonus() {
    System.out.println(
        "Calculating employee bonus..."
        );
}
}
// Contractor is not bonus eligible
class Contractor extends TeamMember {
    public Contractor(String name){
        super(name);
    }


public void work() {
    System.out.println(
        "contractor working..."
        );
}
}

// Test
public class Main {
    public static void main(String[] args) {
        Employee emp = 
        new Employee("Rahim");
        
         Contractor con = 
         new Contractor("Karim");
         
         emp.calculateBonus();
         
         con.work();
    }
}
   
