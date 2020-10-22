import java.util.Scanner;

public class StudentTester {

	private static Scanner s = new Scanner(System.in);
	private static Student student;

	public static void main(String[] args) {

		System.out.println("Do you want to enter name yes/no");
		String isName = s.next();

		System.out.println("Do you want to enter id yes/no");
		String isId = s.next();

		System.out.println("Do you want to enter grade yes/no");
		String isgrade = s.next();

		if (isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && isgrade.equalsIgnoreCase("yes")) {

			System.out.println("Enter name, id and grade values");
			String name = s.next();
			String id = s.next();
			double grade = s.nextDouble();

			student = new Student(name, id, grade);
			displayDetails();

		} else if (isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && !isgrade.equalsIgnoreCase("yes")) {

			System.out.println("Enter name, id values");
			String name = s.next();
			String id = s.next();

			student = new Student(name, id);
			displayDetails();

		} else if (!isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes")
				&& !isgrade.equalsIgnoreCase("yes")) {
			System.out.println("Enter id value");
			String id = s.next();

			student = new Student(id);
			displayDetails();
		} else {
			System.out.println("you must atleast select any one of the name or id");
		}
	}

	public static void displayDetails() {
		System.out.println("Do you want to enter year yes/no");
		String isYear = s.next();
		if (isYear.equalsIgnoreCase("yes")) {
			System.out.println("Enter year");
			int year = s.nextInt();
			student.display(year);
		} else {
			student.display();
		}
	}
}
