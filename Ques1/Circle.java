
public class Circle {  
   private double radius;
   private String color;
   
   public Circle() {  
      radius = 1.0;
      color = "black";
   }
   
  
   public Circle(double r) {  
      radius = r;
      color = "black";
   }
   
   
   public double getRadius() {
     return radius; 
   }
    
   public double getArea() {
      return radius*radius*Math.PI;
   }
}