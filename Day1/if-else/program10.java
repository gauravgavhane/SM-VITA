// Write a Java program to check whether a given character is a vowel or consonant.

import java.util.Scanner;

class program10
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';
        System.out.println("Enter the character : ");
        ch = sobj.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}