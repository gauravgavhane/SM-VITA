
import java.util.Scanner;

// Write a Java program to check whether a given number is divisible by 5.

class program4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the number : ");
        no = sobj.nextInt();

        if(no % 5 == 0)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not Divisible by 5");
        }
    }
}