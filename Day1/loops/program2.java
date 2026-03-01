// Write a Java program to print numbers from 1 to N, but stop if a number divisible by 7 is encountered.

import java.util.*;

class program2
{
    public static void main(String arg[])
    {
        int no = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the N number : ");
        no = sobj.nextInt();

        for(int i = 1; i<= no; i++)
        {
            System.out.print(i+"\t");
            if(i % 7 == 0)
            {
                System.out.println("Number divisible by 7 encountered, stopping...");
                break;
            }
        }
        System.out.println();
    }
}