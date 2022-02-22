import java.util.*;
class variable
{
    public static void main(String args[])
    {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a,b,c Values:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if (a==b && b==c && c==a)
    {
        System.out.println("All Variables are Equal");
    }
    else
    {
        System.out.println("All Variables are Not Equal");
    }
    
    }
}
    
    
    
