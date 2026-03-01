// Using if.else if.  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

import java.util.*;

class program5
{
    public static void Result(int Score)
    {
        if(Score >= 0 && Score <= 35)
        {
            System.out.println("Failed");
        }
        else if(Score > 35 && Score <= 50)
        {
            System.out.println("Passed");
        }
        else if(Score > 50 && Score <= 60)
        {
            System.out.println("Second class");
        }
        else if(Score > 60 && Score <= 75)
        {
            System.out.println("First class");
        }
        else if(Score > 75 && Score <=100)
        {
            System.out.println("Distinction");
        }
        else
        {
            System.out.println("Invalid score");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);    

        int Marks = 0;

        System.out.println("Enter your percentage : ");
        Marks = sobj.nextInt();

        Result(Marks);
    }
}