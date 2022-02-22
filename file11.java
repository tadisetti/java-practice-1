import java.util.*;
class file11
{
    public static void main (String args[])
    {
        int r;
        float pi=3.14f,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        r=sc.nextInt();
        area=pi*r*r;
        System.out.println("The Area of the Circle is:"+area);
    }
}
