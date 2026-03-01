// Write a Java program to find the greatest of three numbers using if–else.

import java.util.Scanner;

class program8
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        System.out.print("Enter first number: ");
        num1 = sobj.nextInt();

        System.out.print("Enter second number: ");
        num2 = sobj.nextInt();

        System.out.print("Enter third number: ");
        num3 = sobj.nextInt();

        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("Greatest number is: " + num1);
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            System.out.println("Greatest number is: " + num2);
        }
        else
        {
            System.out.println("Greatest number is: " + num3);
        }
    }
}