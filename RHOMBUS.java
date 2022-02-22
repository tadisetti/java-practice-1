import java.util.*;
class file17
{
    public static void main (String args[])
    {
        int d1,d2;
        float area,circumference;
        
          Scanner sc=new Scanner(System.in);
          
        System.out.println("Enter ");
        h=sc.nextInt();
        System.out.println("Enter Breadth of Paralleogram");
        b=sc.nextInt();
        area=h*b;
        circumference=2*(h+b);
        
        System.out.println("Area of Paralleogram is:"+area);
        System.out.println("circumference of Paralleogram is:"+circumference);
        