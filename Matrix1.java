import java.util.Scanner;
class Matrix
{
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	
	Scanner sc=new Scanner(System.in);

	void get()
	{
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=sc.nextInt();
		}

	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			b[i][j]=sc.nextInt();
		}

	}
        }
	
	void display()
	{
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(a[i][j]+" ");
			
                }
			System.out.println();
	}System.out.println();

	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(b[i][j]+" ");
					}
			System.out.println();
	}
	}

	void sum()
	{	System.out.println();

		for(int i=0;i<2;i++)
	        {
			for(int j=0;j<2;j++)
			{
			int c=a[i][j]+b[i][j];
			System.out.print(c+" ");
			}
			System.out.println();
	        }

	}
	void sub()
	{
		System.out.println();

		for(int i=0;i<2;i++)
	        {
			for(int j=0;j<2;j++)
			{
			int c=a[i][j]-b[i][j];
			System.out.print(c+" ");
			}
			System.out.println();
	        }

	}
	void mul()
	{
		System.out.println();

		for(int i=0;i<2;i++)
	        {
			for(int j=0;j<2;j++)
			{
			int c=a[i][j]*b[i][j];
			System.out.print(c+" ");
			}
			System.out.println();
	        }

	}

	void div()
	{
		System.out.println();

		for(int i=0;i<2;i++)
	        {
			for(int j=0;j<2;j++)
			{
			int c=a[i][j]/b[i][j];
			System.out.print(c+" ");
			}
			System.out.println();
	        }

	}

}
																										 																															

class Matrix1 {
	public static void main(String a[])
	{
	Matrix m=new Matrix();
	m.get();
	m.display();
	m.sum();
	m.sub();
	m.mul();
	m.div();
	}

}