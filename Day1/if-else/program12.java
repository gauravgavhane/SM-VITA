// Write a Java program to calculate the electricity bill based on units consumed:
//     • Up to 100 units → ₹1/unit
//     • 101–200 units → ₹2/unit
//     • Above 200 units → ₹3/unit

import java.util.Scanner;

class program12
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0, bill = 0;
        System.out.println("Enter the units consumed : ");
        units = sobj.nextInt();

        if(units <= 100)
        {
            bill = units * 1;
            System.out.println("Electricity bill : " + bill + " ₹");
        }
        else if(units > 100 && units <= 200)
        {
            bill = units * 2;
            System.out.println("Electricity bill : " + bill + " ₹");
        }
        else
        {
            bill = units * 3;
            System.out.println("Electricity bill : " + bill + " ₹");
        }
    }
}