
class Excp_Hndl
{
	public static void main(String args[])
	{

		int a=12, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Its not possible to divide by 0..");
		}
		System.out.println("Program ended");
	}
}
