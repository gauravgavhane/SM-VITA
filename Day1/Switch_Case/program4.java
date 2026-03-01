
import java.util.Scanner;

// Write a Java program to display grade description based on grade character:
// •	A → Excellent
// •	B → Very Good
// •	C → Good
// •	D → Average
// •	F → Fail

class program4
{
    public static void Grade(char gc)
    {
        switch(gc)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.err.println("Invalid input");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        char ch;
        System.out.println("Enter the grade : ");
        ch = sobj.next().charAt(0);

        Grade(ch);
    }
}