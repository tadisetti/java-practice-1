import java.util.*;
class searchary
{
    public static void main(String args[])
    {
        int n,x,flag=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements you want in array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the Elements");
        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the  Element you want to find:");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        
            if(flag==1)
        {
            System.out.println("Element  found at  position:"+(i + 1));
        }
        else
        {
            System.out.println("Element Not found");
        }
    }   

        
}