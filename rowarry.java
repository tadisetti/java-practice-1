import java.util.*;
class rowarry
{
    public static void main(String args[])
    {
        int i,j,r,c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Row Size");
        r=sc.nextInt();
        System.out.println("Enter Cloum Size");
        c=sc.nextInt();
        
        int a[][]=new int[r][c];
        System.out.println("Enter Elements to Array:");
        for(i=0;i<r;i++)
        {
           for(j=0;j<c;j++)
        {
            a[i][j]=sc.nextInt();
        }   
        }
        System.out.print("The Elements in an Array is: \n");
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("\t "+a[i][j]);
                
            }
            System.out.print(" ");
        }
    }
}