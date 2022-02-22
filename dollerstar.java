import java.util.*;
class dollerstar
{
    public static void main(String[] args)
    
    
        int i,j;
        
        for(i=1; i<=5; i++)
        {
            for(j=1;j<=i;j++)
            {
            if(i+j==6 ||i==j)
            {
                System.out.println(" $ ");
                
            }
            else
            {
                System.out.println(" * ");
            }
                System.out.println("\n");
                
            }
            
            
        }
    
}