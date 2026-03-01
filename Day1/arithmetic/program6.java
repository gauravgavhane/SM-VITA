// accept a number and check whether it is divisible by 3 or not.

import java.util.Scanner;

class program6
{
    public static void Divisible(int num)
    {
        if(num % 3 == 0)
        {
            System.out.println("Number is divisible by 3");
        }
        else
        {
            System.out.println("Number is not divisible by 3");
        }
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no = 0;

        System.out.println("Enter a number : ");
        no = sobj.nextInt();

        Divisible(no);
    }
}