// Write a Java program to keep accepting numbers from the user until the user enters 0.

import java.util.*;

class program3
{
    public static void main(String arg[])
    {
        int no = 1;
        Scanner sobj = new Scanner(System.in);


        while(no != 0)
        {
            System.out.print("Enter the number : ");
            no = sobj.nextInt();
        }
    }
}