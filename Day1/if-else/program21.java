// Write a Java program to check whether a given character is:
//     • Uppercase letter >=65 && <=90
//     • Lowercase letter  >=97 && <=122
//     • Digit  [ 48–57 → 0–9 (Digits) ]
//     • Special character

import java.util.Scanner;

class program21
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';
        System.out.println("Enter a character : ");
        ch = sobj.next().charAt(0);

        if( ch >= 65 && ch <= 90 )
        {
            System.out.println("Uppercase letter");
        }
        else if( ch >= 97 && ch <= 122 )
        {
            System.out.println("Lowercase letter");
        }
        else if( ch >= 48 && ch <= 57 )
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special character");
        }
    }
}