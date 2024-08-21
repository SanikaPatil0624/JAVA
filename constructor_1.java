import java.util.*;
class constructor_1
{
int prn;
String nm;


	constructor_1()
	{
		Scanner sc=new Scanner(System.in);
		nm = sc.nextLine();
		prn = sc.nextInt();
		System.out.println(nm);
		System.out.println(prn);
	}

public static void main(String a[])
{
	constructor_1 cn=new constructor_1();
	
}
}