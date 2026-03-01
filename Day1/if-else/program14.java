// Write a Java program to check whether a person is a Child, Adult, or Senior Citizen based on age.

import java.util.Scanner;

class program14
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int age = 0;
        System.out.println("Enter the age : ");
        age = sobj.nextInt();

        if(age >= 0 && age <= 12)
        {
            System.out.println("Child");
        }
        else if(age > 12 && age <= 60)
        {
            System.out.println("Adult");
        }
        else if(age > 60)
        {
            System.out.println("Senior Citizen");
        }
    }
}