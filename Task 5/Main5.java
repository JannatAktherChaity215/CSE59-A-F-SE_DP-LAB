
class UniversityMember{
    void attendLecture(){
        System.out.println("Lecture");

        }
    }
    interface Researcher{
        void conductLabResearch();
    }
    class Professor extends UniversityMember
    implements Researcher{
        public void conductLabResearch(){
       System.out.println("Research");
    }
    }
    class UndergraduateStudent
    extends UniversityMember{

    }
public class Main5{
    public static void main(String[] args){
       UndergraduateStudent u =
       new UndergraduateStudent();
       u.attendLecture();
       Professor p=
       new Professor();
       p.conductLabResearch();

    }
}
