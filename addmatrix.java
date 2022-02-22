import java.util.*;
class addmatrix
{
    public static void main(String args[])
    {
        int i,j,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Order of 1st Matrix:");
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int c1[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }System.out.println("Enter Element to 2nd Matrix:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                c1[i][j]=sc.nextInt();
                c1[i][j]=a[i][j]+b[i][j];
                System.out.println(c1[i][j]+"\t");
            }
        }
        System.out.println();
        
    }
}