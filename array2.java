import java.util.*;
class array2
{
    public static void main(String args[])
    
    {
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("The Element in An Array is:\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("  "+a[i][j]);
                
            }
            System.out.print("  ");
        }
    }
}