
import java.util.Scanner;

// Write a Java program to check whether a given number is even or odd.

class program2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the number : ");   
        no = sobj.nextInt();

        if( no % 2 == 0)
        {
            System.out.println("Even number");
        } 
        else
        {
            System.out.println("Odd number");
        }
    }

}