import java.util.*;
class Triangle {
	private int s1,s2,s3,peri;
	public Triangle()
	{
		s1=0;
		s2=0;
		s3=0;
	}
	public void sets1(int s1) {
		this.s1=s1;
	}
	public void sets2(int s2) {
		this.s2=s2;
	}
	public void sets3(int s3) {
		this.s3=s3;
	}

	public int gets1() {
		return s1;
	}
	public int gets2() {
		return s2;
	}
	public int gets3() {
		return s3;
	}

	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for side_1 : ");
		s1=sc.nextInt();
		System.out.println("Enter value for side_2 : ");
		s2=sc.nextInt();
		System.out.println("Enter value for side_3 : ");
		s3=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Side 1:"+this.s1);
		System.out.println("Side 2:"+this.s2);
		System.out.println("Side 3:"+this.s3);
	}

	public int calcPeri() {
		peri=s1+s2+s3;
		return peri;
	}

	public void isValid() {
		if((s1+s2>=s3) || (s1+s3>=s2) || (s3+s2>=s1))
		{
			System.out.println("Triangle is valid....");
		}
	}



	public static void main(String a[])
	{
		//Triangle t=new Triangle();
		Triangle[] arr = new Triangle[4];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Triangle();
			arr[i].accept();
			arr[i].display();
			arr[i].isValid();
		}
		
	}

}
