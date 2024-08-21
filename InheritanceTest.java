import java.util.*;

class Person {
	private String name;
	private float height;
	private float weight;
	private String address;
	private int birthYear = 2023;
	private int birthMonth = 8;
	private int birthDay = 2;

	Scanner sc = new Scanner(System.in);

	Person() {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		;

		System.out.print("Enter height: ");
		height = sc.nextFloat();

		System.out.print("Enter weight: ");
		weight = sc.nextFloat();


		sc.nextLine(); // consume the leftover newline
		System.out.print("Enter address: ");
		address = sc.nextLine();

		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Address: " + address);
	}

	void calculateAge() {
		Calendar today = Calendar.getInstance();
		int currentYear = today.get(Calendar.YEAR);
		int currentMonth = today.get(Calendar.MONTH) + 1;
		int currentDay = today.get(Calendar.DAY_OF_MONTH);

		int age = currentYear - birthYear;

		if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
			age--;
		}

		System.out.println("Age: " + age + " years");
	}
}

class Student extends Person {
	private int rollNo;
	private int marksS1;
	private int marksS2;
	private int marksS3;

	public Student() {
		super();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter roll number: ");
		rollNo = sc.nextInt();


		System.out.print("Enter marks for subject 1: ");
		marksS1 = sc.nextInt();

		System.out.print("Enter marks for subject 2: ");
		marksS2 = sc.nextInt();

		System.out.print("Enter marks for subject 3: ");
		marksS3 = sc.nextInt();

		System.out.println("Roll_no: " + rollNo);
	}

	void calculateAvg() {
		int avg = (marksS1 + marksS2 + marksS3) / 3;
		System.out.println("Average: " + avg);
	}
}

class Employee extends Person {
	private int empId;
	private float salary;

	public Employee() {
		super();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee ID: ");
		empId = sc.nextInt();

		System.out.print("Enter salary: ");
		salary = sc.nextFloat();

		System.out.println("EmpId: " + empId);
		System.out.println("Salary: " + salary);
	}

	void calculateTax() {
		int taxRate = 10;
		float totalTax = salary * taxRate / 100;
		System.out.println("Tax: " + totalTax);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.calculateAge();
		s.calculateAvg();

		Employee e = new Employee();
		e.calculateAge();
		e.calculateTax();
	}
}
