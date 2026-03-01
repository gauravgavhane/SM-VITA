// Write a Java program to find the absolute value of a number without using Math.abs().
// [ If the number is negative, make it positive by multiplying with -1
//  If the number is positive or zero, keep it as it is]

import java.util.Scanner;

class program19
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter a number : ");
        no = sobj.nextInt();

        if(no < 0)
        {
            no = no * -1;
        }

        System.out.println("Absolute value is : " + no);
    }
}
