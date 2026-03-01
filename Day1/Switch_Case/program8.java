
import java.util.Scanner;

// Write a Java program to display weekday or weekend based on day number using switch.

class program8
{
    public static void Display(int no)
    {
        switch(no)
        {
            case 1:
                System.out.println("Day 1: Monday : Weekday");
                break;
            case 2:
                System.out.println("Day 2: Tuesday : Weekday");
                break;
            case 3:
                System.out.println("Day 3: Wednesday : Weekday");
                break;
            case 4:
                System.out.println("Day 4: Thursday : Weekday");
                break;
            case 5:
                System.out.println("Day 5: Friday : Weekday");
                break;
            case 6:
                System.out.println("Day 6: Saturday : Weekend");
                break;
            case 7:
                System.out.println("Day 7: Sunday : Weekend");
                break;
            default:
                System.out.println("Invalid input");
                break;
            
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter the number : ");
        num =sobj.nextInt(); 

        Display(num);   
    }

}