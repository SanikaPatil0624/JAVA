import java.util.Scanner;
import java.lang.*;

class scanner
{
	public static void main(String a[])
	{
		int first,second,add,sub,mul,div,choice;
		Scanner sc=new Scanner(System.in);

		System.out.println 

("Enter 1st number = ");
		first=sc.nextInt();
		System.out.println("......................");

		System.out.println("Enter 2nd number = ");
		second=sc.nextInt();
		System.out.println(".....................");

		
		System.out.println(" 1)Addition | 2)Subtraction | 3)Multiplication | 4)Division \n");

		System.out.println("Enter the choice = ");
		choice=sc.nextInt();

		
		

		switch(choice)
		{
		case 1: add=first+second; System.out.println("\nAddition = "+add); break;
		case 2: sub=first-second; System.out.println("\nSubtraction = "+sub); break;
		case 3: mul=first*second; System.out.println("\nMultiplication = "+mul); break;
		case 4: div=first/second; System.out.println("\nDivision = "+div); break;
		default:System.out.println("Invalid choice.... ");

		}
	
	}
}











