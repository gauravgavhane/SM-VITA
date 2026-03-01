
import java.util.Scanner;

// Write a Java program to convert number (1–5) into words using switch.

class program7
{
    public static void Convert(int no)
    {
        switch(no)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Input input");
                break;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number : ");
        num = sobj.nextInt();

        Convert(num);

    }
}