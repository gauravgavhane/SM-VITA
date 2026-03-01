
import java.util.Scanner;

// Write a Java program to check whether a person is eligible to vote (age ≥ 18).

class program3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int age = 0;
        System.out.println("Enter the age : ");
        age = sobj.nextInt();

        if(age >= 18)
        {
            System.out.println("Person is eligible to vote");
        }
        else
        {
            System.out.println("Person is not eligible to vote");
        }
    }

}