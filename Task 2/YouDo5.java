class Painter {
     void printData(String text) {
         System.out.println(text);
     }
      void printData(int number) {
         System.out.println(number);
     }
}
public class Main {
    public static void main(String[] args) {
        Painter p = new Painter();
        
        p.printData("Hello Java");
        p.printData(100);
    }
}
