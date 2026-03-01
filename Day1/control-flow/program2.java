
import java.util.Scanner;

// declare two numbers and one operator as a character. e.g. '+', '-', '*', '/' and perform the operation based on the operator using switch case.

class program2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int no1 = 0, no2 = 0, ans = 0;
        char opr;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();

        System.out.println("Enter operator (+, -, *, /) : ");
        opr = sobj.next().charAt(0);

        switch(opr)
        {
            case '+':
                ans = no1 + no2;
                System.out.println("Addition : "+ans);
                break;
            case '-':
                ans = no1 - no2;
                System.out.println("Subtraction : "+ans);
                break;
            case '*':
                ans = no1 * no2;
                System.out.println("Multiplication : "+ans);
                break;
            case '/':
                ans = no1 / no2;
                System.out.println("Division : "+ans);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}