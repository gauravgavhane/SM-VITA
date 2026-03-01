// accept two numbers and check whether first number is greater or second number is greater or they are equal.

import java.util.Scanner;

class program5
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();

        if(no1 > no2)
        {
            System.out.println("First number is greater than second number");
        }
        else if(no2 > no1)
        {
            System.out.println("Second number is greater than first number");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}