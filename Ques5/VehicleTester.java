
import java.util.Scanner;

public class VehicleTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu...");
		
		System.out.println("Enter 1 to create vehicle object");
		System.out.println("Enter 2 to create car object");
		System.out.println("Enter 3 to create convertible object");
		System.out.println("Enter 4 to create sport car object");
		
		System.out.println();
		System.out.println("Enter your choice");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			Vehicle vehicle = new Vehicle(7, 0, 2016, "Nissan");
			vehicle.display();
			break;
		case 2:
			Car car = new Car(2019, "Hyundai", 4);
			car.display();
			break;
		case 3:
			Convertible convertible = new Convertible(2015, "Mahindra",3, true);
			convertible.display();
			break;
		case 4:
			SportCar sportCar = new SportCar(2014, "Chevrolet");
			sportCar.display();
			break;
		default:
			break;
		}

	}
}