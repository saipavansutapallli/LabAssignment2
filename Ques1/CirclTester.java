
public class CirclTester {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("The circle has radius of " + c.getRadius() + " and area of " + c.getArea());
		
		Circle c1 = new Circle(2.0);
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		
	}
}
