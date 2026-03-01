// Write a Java program to calculate bonus based on salary:
//     • Salary ≥ 50,000 → 10% bonus
//     • Salary < 50,000 → 5% bonus

import java.util.Scanner;

class program13
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int salary = 0, bonus = 0;
        System.out.println("Enter the salary : ");
        salary = sobj.nextInt();

        if(salary >= 50000)
        {
            bonus = (salary * 10) / 100;
            System.out.println("Bonus : " + bonus);
        }
        else if(salary < 50000)
        {
            bonus = (salary * 5) / 100;
            System.out.println("Bonus : " + bonus);
        }
    }
}