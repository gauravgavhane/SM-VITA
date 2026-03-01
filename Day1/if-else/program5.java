
import java.util.Scanner;

// Write a Java program to check whether a given year is a leap year.

class program5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the year : ");
        no = sobj.nextInt();

        if(no % 4 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not Leap year");
        }
    }
}