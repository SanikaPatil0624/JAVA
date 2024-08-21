import java.util.*;
class employee
{
	private String name;
	private int ID;
	private double salary;

	employee(String name, int ID,double salary)
	{
		this.name=name;
		this.ID=ID;
		this.salary=salary;
	}

	public void setName(String name)
	{
		this.name=name;

	}




	
	public   String getName()
	{

		return name;
	}
	public  void setID(int ID)
	{
		this.ID=ID;

	}
	public int getID()
	{
		return ID;

	}
	public  void setSalary(double salary)
	{
		this.salary=salary;
	}
	public  double getSalary()
	{
		return salary;
	}
    public void raise_salary()
    {
        this.salary=this.salary*1.10;
    }
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the name = ");
		String name=sc.nextLine();


		System.out.println("Enter the ID = ");
		int ID=sc.nextInt();


		System.out.println("Enter the Salary = ");
		double salary=sc.nextDouble();

		employee ob=new employee(name,ID,salary);
		System.out.println("Name= "+ob.getName());
        System.out.println("ID= "+ob.getID());
		System.out.println("Salary= "+ob.getSalary());
		ob.raise_salary();
		System.out.println("Salary= "+ob.getSalary());
	}
}