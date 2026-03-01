// Write a Java program to check whether a given number is divisible by both 3 and 5.

import java.util.Scanner;

class program17
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter a number : ");
        no = sobj.nextInt();

        if( (no % 3 == 0) && (no % 5 == 0) )
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}