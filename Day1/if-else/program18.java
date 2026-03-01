// Write a Java program to validate login credentials using predefined username and password.

import java.util.Scanner;

class program18
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String username = "", password = "";

        System.out.print("Enter username: ");
        username = sobj.nextLine();

        System.out.print("Enter password: ");
        password = sobj.nextLine();

        if(username.equals("admin") && password.equals("password123"))
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Invalid username or password");
        }
    }
}