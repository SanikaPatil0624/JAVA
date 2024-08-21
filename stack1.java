import java.util.*;
interface stack
{
    void push();
    void pop();
    void display();
}
class stack1 implements stack
{
    public int top=-1;
    public int max;
    int stk_arry[max];
    int push_ele;

    Scanner sc=next Scanner(Sysytem.in);
    System.out.println("Enter the max size = ");
    max=sc.nextInt();
    void  push()
    {
        if(top==stk_arry[max]-1)
        {
            System.out.println("Overflow....");
        }else
        {
            System.out.println("Enter the element  = ");
            push_ele=sc.nextInt();
           push_ele= stk_arry[top];;

           
            top++;
        }
    }
    void display()
    {
        for(int i=stk_arry[0];i<stk_arry[top];i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String a[])
    {
        stack obj = new stack1();
        obj.push();
        obj.display();

    }
}