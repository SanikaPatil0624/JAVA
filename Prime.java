class Prime
{
	public static void main(String args[])
	{
		int a=1;
		boolean flag=false;
		if(a==1)
		{
			System.out.println("Not prime or not composite number..");
		}
		else{
		for(int i=2;i<=a/2;++i)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Not prime");
			}else{
				System.out.println("Prime");
		}	
		}
	}
}