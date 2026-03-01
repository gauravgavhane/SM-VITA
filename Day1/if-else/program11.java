// Write a Java program to assign grade based on marks:
//     • Marks ≥ 90 → Grade A
//     • Marks ≥ 75 → Grade B
//     • Marks ≥ 60 → Grade C
//     • Marks < 60 → Fail

import java.util.Scanner;

class program11
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int marks = 0;
        System.out.println("Enter the marks : ");
        marks = sobj.nextInt();

        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}