import java.util.*;
class duplicatearry
{
    public static void main(String args[])
    {
        int arry[]={10,20,10,30,50,20};
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter remove Duplicate Elements");
        
        for(i=0;i<arry.length-1;i++)
        {
            for(j=i+1;j<arry.length;j++)
            if(arry[i]==arry[j]&&(i!=j))
            {
            System.out.println("The Given Orginal arry");
            System.out.println("The Remove Duplicate Element:" +arry[j]);    
            }
        }
        
        
    }
}