import java.util.*;
class Excp_Hndl2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter numbers in array...");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number for divisor...");
		int b=sc.nextInt();
		int c;
		for(int j=0; j<5; j++) {

			try {
				c=a[j]/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("Its not possible to divide by 0..");
				break;
			}
		}
	}
}
