class Month
{
	public static void main(String args[])
	{
		int n=0,i;
		for(i=0;i<args.length;i++)
		n=Integer.parseInt(args[i]);
			
		
		switch(n)
		{
			case 1:
			System.out.println("January");
			break;

			case 2:
			System.out.println("February");
			break;

			case 3:
			System.out.println("March");
			break;

			case 4:
			System.out.println("April");

			break;
		
			case 5:
			System.out.println("May");
			break;

			case 6:	
			System.out.println("Jun");
			break;

			case 7:
			System.out.println("July");
			break;
	
			case 8:
			System.out.println("August");
			break;

			case 9:
			System.out.println("September");
			break;

			case 10:
			System.out.println("October");
			break;

			case 11:
			System.out.println("November");
			break;

			case 12:
			System.out.println("December");
			break;

				
			default:
			 System.out.println("Invalid Choice...");

		}

	}
}