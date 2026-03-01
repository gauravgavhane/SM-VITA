// Write a Java program to find the smaller of two numbers.

import java.util.Scanner;

class program7
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        System.out.print("Enter first number: ");
        num1 = sobj.nextInt();

        System.out.print("Enter second number: ");
        num2 = sobj.nextInt();

        if(num1 < num2)
        {
            System.out.println("smaller number is: " + num1);
        }
        else if(num2 < num1)
        {
            System.out.println("smaller number is: " + num2);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }
}

