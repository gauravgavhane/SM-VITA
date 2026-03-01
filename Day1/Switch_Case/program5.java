// Write a Java program to check whether a given character is a vowel using switch.

import java.util.Scanner;

class program5
{
    public static void Vowel(char ch)
    {
        switch(ch)
        {
            case 'a':
                System.out.println("Character is a vowel");
                break;
            case 'e':
                System.out.println("Character is a vowel");
                break;
            case 'i':
                System.out.println("Character is a vowel");
                break;
            case 'o':
                System.out.println("Character is a vowel");
                break;
            case 'u':
                System.out.println("Character is a vowel");
                break;
            case 'A':
                System.out.println("Character is a vowel");
                break;
            case 'E':
                System.out.println("Character is a vowel");
                break;
            case 'I':
                System.out.println("Character is a vowel");
                break;
            case 'O':
                System.out.println("Character is a vowel");
                break;
            case 'U':
                System.out.println("Character is a vowel");
                break;
            
            default:
                System.out.println("Character is not a vowel");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        char c;
        System.out.println("Enter a character : ");
        c = sobj.next().charAt(0);

        Vowel(c);
    }
}