// Write a Java program to print numbers from 1 to 30, but skip numbers divisible by 3.

class program8
{
    public static void main(String arg[])
    {
        for(int i = 1; i <= 30; i++)
        {
            if(i%3 == 0)
            {
                System.out.println("Multiple of 3");
                continue;
            }
            System.out.println(i);
        }
    }
}