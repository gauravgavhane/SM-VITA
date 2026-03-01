// Accept two numbers and create a simple calculator using switch:
// •	Addition
// •	Subtraction
// •	Multiplication
// •	Division

import java.util.Scanner;

class program3
{
    public static int Calculate(int num1, int num2, char operator)
    {
        int Ans = 0;
        switch(operator)
        {
            case '+':
                Ans = num1 + num2;
                break;
            case '-':
                Ans = num1 - num2;
                break;
            case '*':
                Ans = num1 * num2;
                break;
            case '/':
                Ans = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        return  Ans;
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0, result= 0;
        char ch;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();

        System.out.println("Enter operator (+, -, *, /) : ");
        ch = sobj.next().charAt(0);

        result = Calculate(no1, no2, ch);
        System.out.println("Result is "+result);
    }
}