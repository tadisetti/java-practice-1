import java.util.*;
class palindromearry
{
    public static void main(String args[])
    {
        String original,reverse="";
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String/number to check if it is palindram:");
        original=in.nextline();
        
        int Length=original.Length();
        
        for(int i=Length-1;i>=0;i--)
        reverse=reverse+original.CharAt(i);
        
        if(original.equals(reverse))
        
        System.out.println("Enter String/number is a Plindrome");
    else    
        System.out.println("Enter String/number is not Plindrome");
        
    }
}
    
        

        
    
