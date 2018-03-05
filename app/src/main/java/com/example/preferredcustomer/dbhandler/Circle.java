public class Circle extends Shape {
     private double rad = 10;
     public void printMe() {
          System.out.println("I'm a circle.");
     }

     public double computeArea() {
          return rad * rad * 3.14;
     }
}