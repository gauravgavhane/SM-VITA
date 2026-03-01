// Write a Java program to print numbers from 1 to 20, but skip all even numbers.

class program7
{
    public static void main(String arg[])
    {
        for(int i = 1; i <= 20; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Even Number");
                continue;
            }
            System.out.println(i);
        }
    }
}