// Write a Java program to print numbers from 1 to 10, but skip printing 5 using continue.

class program6
{
    public static void main(String arg[])
    {
        for(int i = 1; i <= 10; i++)
        {
            if(i == 5)
            {
                System.out.println("Skipping number 5");
                continue;
            }
            System.out.println(i);
        }
    }
}