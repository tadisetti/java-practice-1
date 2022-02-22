import java.util.*;
class arr2
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter Element to Array:");
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        System.out.println("The Element in an Array is:");
        for(i=0;i<n;i++)
        {
            System.out.println("\t"+a[i]);
        }
    }
}