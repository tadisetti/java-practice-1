import java.util.*;
class file14
{
    public static void main (String args[])
    {
        int p,r,t;
        float si,Tamt;
        si=p*r*t/100;
        Tamt=p+si;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Principle Amount:");
        p=sc.nextInt();
        System.out.println("Enter Rate of Intrest:");
        r=sc.nextInt();
        System.out.println("Enter Total No.of Months:");
        t=sc.nextInt();
        
        
        System.out.println("The Given Simple Intrest  is:"+si);
        System.out.println("The Given Total Amount  is:"+Tamt);
    }
}