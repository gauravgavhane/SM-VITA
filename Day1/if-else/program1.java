
import java.util.Scanner;

// Write a Java program to check whether a given number is positive, negative, or zero.

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the number : ");   
        no = sobj.nextInt();

        if( no > 0)
        {
            System.out.println("Positive number");
        } 
        else if( no < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Zero");
        }
    }

}