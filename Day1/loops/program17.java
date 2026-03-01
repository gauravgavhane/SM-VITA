
import java.util.Scanner;

// Write a Java program to accept numbers until the user enters -1, and skip numbers divisible by 5.

class program17
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter the number : ");
        no = sobj.nextInt();

        while(no != -1)
        {
            if(no % 5 == 0)
            {
                System.out.println("Number is divisible by 5, skipping...");
                System.out.println("Enter the number : ");
                no = sobj.nextInt();
                continue;
            }
            System.out.println("Enter the number : ");
            no = sobj.nextInt();
        }
}
}