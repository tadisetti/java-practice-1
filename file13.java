import java.util.*;
class file13 
{
    public static void main(String args[])
    {
        int pno;
        String pname;
        float pcost,pqty;
        float bill;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Product Number:");
        pno=sc.nextInt();
        System.out.println("Enter Product Name:");
        pname=sc.next();
        System.out.println("Enter Product Cost:");
        pcost=sc.nextFloat();
        System.out.println("Enter Product Quantity:");
        pqty=sc.nextFloat();
        bill=pqty*pcost;
        
        System.out.println("The Given Product Number is:"+pno);
        System.out.println("The Given Product Name is:"+pname);
        System.out.println("The Given Product Quantity is:"+pqty);
        System.out.println("The Given Product Cost is:"+pcost);
        System.out.println("The Given Total bill Amount is:"+bill);
    }
}