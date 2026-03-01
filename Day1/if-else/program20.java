// Write a Java program to check whether a given number lies between 10 and 50 (inclusive).

import java.util.Scanner;

class program20
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter a number : ");
        no = sobj.nextInt();

        if( no >= 10 && no <= 50 )
        {
            System.out.println("Number lies between 10 and 50");
        }
        else
        {
            System.out.println("Number does not lie between 10 and 50");
        }
    }
}