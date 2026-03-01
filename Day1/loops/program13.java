
import java.util.Scanner;

// Write a Java program to accept marks of students and skip invalid marks (less than 0 or greater than 100).

class program13
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int marks = 0;

        while(true)
        {
            System.out.print("Enter the marks: ");
            marks = sobj.nextInt();

            if(marks == -1)
            {
                break;
            }

            if(marks < 0 || marks > 100)
            {
                System.out.println("Invalid mark");
                continue;
            }
            System.out.println("Mark : " + marks);
        }

    }
}