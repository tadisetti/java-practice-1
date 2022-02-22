import java.util.*;
class file10
{
    public static void main(String args[])
    {
        int eno;
        String ename;
        float esal;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Employee Number:");
        eno=sc.nextInt();
        System.out.println("Enter Employee Name:");
        ename=sc.next();
        System.out.println("Enter Employee Salary:");
        esal=sc.nextFloat();
        
        System.out.println("The Given Employee Number is:"+eno);
        System.out.println("The Given Employee Name is:"+ename);
        System.out.println("The Given Employee Salary is:"+esal);
    }
}