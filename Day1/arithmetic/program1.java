
import java.util.Scanner;

// accept two numbers and add them.

class program1
{
    public static int Add(int num1, int num2)
    {
        int Ans = 0;
        Ans = num1 + num2;
        return  Ans;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0, result= 0;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();

        result = Add(no1, no2);
        System.out.println("Addition is "+result);
    }
}