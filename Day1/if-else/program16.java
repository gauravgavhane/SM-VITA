// Write a Java program to check whether a triangle is valid based on the given sides.
// [ A triangle is valid if all three conditions are true:
// a + b > c
// a + c > b
// b + c > a]

import java.util.Scanner;

class program16
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int a = 0, b = 0, c = 0;
        System.out.println("Enter the sides of triangle : ");
        a = sobj.nextInt();
        b = sobj.nextInt();
        c = sobj.nextInt();

        if( (a + b > c) && (a + c > b) && (b + c > a) )
        {
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Not Valid triangle");
        }
    }
}