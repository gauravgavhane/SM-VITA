
import java.util.Scanner;

// Write a Java program to print numbers from 1 to N, skipping numbers that end with digit 5.
// [ means if we divide by 10 remainder shouldn't be  5 ]

class program15
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0, digit = 0;
        System.out.println("Enter the N number : ");
        no = sobj.nextInt();

        for(int i = 1; i <= no; i++)
        {
            digit = i % 10;
            if(digit == 5)
            {
                continue;
            }
            System.out.print(i+"\t");
        }
    }
}