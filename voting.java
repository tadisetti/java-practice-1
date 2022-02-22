import java.util.*;
class voting
{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Age Values");
        age=sc.nextInt();
         
        if (age>18)
        {
            System.out.println("Eligible For Voting:");
        }
        else
        {
            System.out.println("Not Eligible For Voting:");
        }
        
        
    }
}