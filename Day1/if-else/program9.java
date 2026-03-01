// Write a Java program to check whether a given number is a 3-digit number.
// [If the number is ≥ 100 and ≤ 999
// OR the number is >-100 and ≥ -999
// then it is a 3-digit number.]

import java.util.Scanner;

class program9
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the number : ");
        no = sobj.nextInt();

        if( (no >= 100 && no <= 999) || (no > -100 && no >= -999) )
        {
            System.out.println("3-digit number");
        }
        else
        {
            System.out.println("Not 3-digit number");
        }
    }
}