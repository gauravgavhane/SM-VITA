
import java.util.Scanner;

// Write a Java program to accept 10 numbers from the user and skip negative numbers while printing.

class program11
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int no = 0;

        System.out.println("Enter the number : ");
        for (int i = 0; i < 10; i++) 
        {
            no = sobj.nextInt();
            if( no < 0)
            {
                System.out.println("negative number");
                continue;
            }
            System.out.println("Printing ... "+no);
        }
    }
}