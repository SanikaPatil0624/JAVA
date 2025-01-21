public class Main_a{
    private double pi=3.14;
    private double r=10;
    public double Area()
    {
       // float ar=pi*r*r;
        return pi*r*r;
    }
    public double Circumference()
    {
        //int cr=2*pi*r;
        return 2*pi*r;
    }

    public static void main(String a[])
    {
        Main ob=new Main();
       double res1= ob.Area();
       double res2=ob.Circumference();
       
       System.out.println("Area :"+res1);
       System.out.println("Circumference :"+res2);
    }
}
