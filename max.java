import java.util.Scanner;
class max
{
     public static void main(String[] args)
}
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c Values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
             System.out.println("A is Big");
             else
             System.out.println("B is Big");
        }
        else 
        {
              if(b>c)
              System.out.println("B is Big");
            else
              System.out.println("C is Big");
        }
    }
    
    
    