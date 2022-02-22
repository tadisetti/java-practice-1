import java.util.*;
class case
{
    public static void main(String args[])
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Weekday");
    n=sc.nextInt();
    
    case 1:
    System.out.println("Sunday");
    break;
    case 2:
        System.out.println("Monday");
    break;
    case 3:
        System.out.println("Tuesday");
    break;
    case 4:
        System.out.println("Wenesday");
    break;
    case 5:
        System.out.println("Thursday");
    break;
    case 6:
        System.out.println("Friday");
    break;
    case 7:
        System.out.println("Saturday");
    break;
    default :
    System.out.println("Enter 1 t0 7 days");
}
