
import java.util.Scanner;

// Write a Java program to print numbers from 1 to N, but skip numbers divisible by both 4 and 5.

class program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the N number : ");
        for(int i = 1; i <= no; i++)
        {
            if((i%4 == 0)&& (i%5 == 0))
            {
                System.out.println("Multiple of 4 and 5");
                continue;
            }
            System.out.println(i);
        }
    }
}