import java.util.*;
import java.io.*;

class Solution13
{
	public static void main (String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        
        Object wrappedNumber1 = a;
        Object wrappedNumber2 = b;
        
        Object res1=wrappedNumber1.getClass().getSimpleName();
        System.out.println(res1);
        Object res2=wrappedNumber2.getClass().getSimpleName();
        System.out.println(res2);
      
    if (wrappedNumber1 instanceof Double && wrappedNumber2 instanceof Double) {
        double avg=(a+b)/2;
        System.out.println("Average is "+avg);
    }
    else{
        System.out.println("Please enter double datatype value....");
    }
        
	}

}
