// accept two numbers and divide them.

import java.util.Scanner;
class program4
{
    public static int Div(int num1, int num2)
    {
        int Ans = 0;
        Ans = num1 / num2;
        return  Ans;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0, result= 0;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();

        result = Div(no1, no2);
        System.out.println("Division is "+result);
    }
}
