import java.util.*;
class zero
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter An Integer Number");
        num=sc.nextInt();
        
        if (num>0)
        {
            System.out.println("Enter Number is Positive:");
        }
        else if(num<0)
        {
            System.out.println("Enter Number is Negative:");
        }
        else
        {
            System.out.println("Enter Number is Zero:");
        }
    
        
    }
}