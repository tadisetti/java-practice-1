import java.util.*;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number To Check It is Divisble By 5 and 11:");
        int number=sc.nextlnt();
        if(number%5==0 && number%11==0)
        {
            System.out.println("Given Number "+number+" is Divisble By 5 and 11");
        }
        else
        {
            System.out.println("Given Number "+number+" is Not Divisble By 5 and 11");
        }
    }
}