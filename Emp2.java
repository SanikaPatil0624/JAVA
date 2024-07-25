import java.util.Scanner;
class Emp{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	long salary;
	String city;
	int id;
	void get()
	{	
		
		System.out.println("Enter the Name of Emp = ");
		 name=sc.nextLine();

		System.out.println("Enter the Age of Emp = ");
		age=sc.nextInt();

		System.out.println("Enter the salary of Emp = ");
		salary=sc.nextLong();

		System.out.println("Enter the City of Emp = ");
		city=sc.next();

		System.out.println("Enter the id of Emp = ");
		id=sc.nextInt();
	}
	
	void display()
	{
		System.out.println();
		System.out.println("..............EMPLOYE INFO..............");

		System.out.println(" Name of Emp = "+ name);
		System.out.println(" Age of Emp = "+ age);
		System.out.println(" ID of Emp = "+ id);
		System.out.println(" Salary of Emp = "+ salary);
		System.out.println(" City of Emp = "+ city);

	}
}
class Emp2{

public static void main(String a[]){
Emp ep = new Emp();
ep.get();
ep.display();
}
}
