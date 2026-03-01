
import java.util.Scanner;

// Write a Java program to display traffic signal meaning based on color:
// •	Red
// •	Yellow
// •	Green

class program9
{
    public static void Display(int no) 
    {
        switch(no)
        {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Wait / Prepare to stop");
                break;
            case 3:
                System.out.println("Go");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);    

        System.out.println(" Select Color");
        System.out.println("1 -> Red");
        System.out.println("2 -> Yellow");
        System.out.println("3 -> Green");

        int choice = 0;
        System.out.println("Enter your choice : ");
        choice = sobj.nextInt();

        Display(choice);
    }
}