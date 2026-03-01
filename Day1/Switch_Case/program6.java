
import java.util.Scanner;

// Write a Java program to display welcome message based on language choice:
// •	1 → English
// •	2 → Hindi
// •	3 → Marathi

class program6
{
    public static void Display(int no)
    {
        switch(no)
        {
            case 1:
                System.out.println("Welcome");
                break;
            case 2:
                System.out.println("स्वागत");
                break;
            case 3:
                System.out.println("स्वागत आहे");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public static void main(String[] args) 
    {
       Scanner sobj = new Scanner(System.in);
       
        System.out.println("Select Language:");
        System.out.println("1 → English");
        System.out.println("2 → Hindi");
        System.out.println("3 → Marathi");


       int choice = 0;
       System.out.println("Enter your choice");
       choice = sobj.nextInt();

        Display(choice);
    }
}