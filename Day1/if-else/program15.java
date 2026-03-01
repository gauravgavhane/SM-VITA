// Write a Java program to validate a bank withdrawal:
//     • If withdrawal amount is greater than balance → print “Insufficient balance”
//     • Otherwise → print “Transaction successful”

import java.util.Scanner;

class program15
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int balance = 0, withdrawalAmount = 0;

        System.out.print("Enter current balance: ");
        balance = sobj.nextInt();

        System.out.print("Enter withdrawal amount: ");
        withdrawalAmount = sobj.nextInt();

        if(withdrawalAmount > balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println("Transaction successful");
        }
    }
}