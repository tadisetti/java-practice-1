import java.util.*;
class file12
{
    public static void main (String args[])
    {
        int a,b,t;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Before Swapping Values:");
        a=sc.nextInt();
        b=sc.nextInt();
        t=a;
        a=b;
        b=a;
        System.out.println("After Swapping Values is:"+a);
        System.out.println("After Swapping Values is:"+b);
    }
}    