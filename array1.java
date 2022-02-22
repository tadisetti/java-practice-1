import java.util.*;
class array1
{
    public static void main(String args[]);
    
    int i,n,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.printLn("Enter Array Size:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.printLn("Enter Array Element");
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.printLn("The Element in Array is:");
    for(i=0;i<n;i++)
    {
        System.out.printLn(arr[i]);
        s=s+arr[i];
    }
     System.out.printLn("Sum of Array is :"+sum);
    
    
    
}