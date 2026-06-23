
//Abstraction
interface Shape {
    double calculateArea();
}

//Extension 1
class Rectangle implements Shape {
    private double length;
     private double width;
     
     public Rectangle(double length,double width){
         this.length = length;
         this.width = width;
         
     }
     public double calculateArea() {
         return length * width;
         
     }
}
//Extension 2
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius *radius;
        
    }
}

// New shape can be added without changing AreaCalculator
class Triangle implements Shape {
   private double base;
   private double height;
   
   public Triangle(double base,double height) {
       this.base = base;
       this.height = height;
   }
 public double calculateArea() {
     return 0.5 * base * height;
 }
 
}

// Closed for modification
class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes){
        double area = 0;
        for(Shape shape : shapes){
            area += shape.calculateArea();
        }
        return area;
    }
}

// Test
public class Main {
    public static void main (String[] args) {
        Shape[] shapes = {
            new Rectangle(10,5),
            new Circle(7),
            new Triangle(8,4)
        };
        AreaCalculator calculator = new AreaCalculator();
        
        System.out.println(
            calculator.calculateTotalArea(shapes)
            );
    }
}


