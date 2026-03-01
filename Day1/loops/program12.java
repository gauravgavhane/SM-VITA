
import java.util.Scanner;

// Write a Java program to print only odd numbers from a user-given range using continue.

class program12
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int start = 0, end = 0;

        System.out.println("Start of the range : ");
        start = sobj.nextInt();

        System.out.println("End of the range : ");
        end  = sobj.nextInt();

        for(int i = start; i <= end; i++)
        {
            if(i % 2 == 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}