// Write a Java program to print all numbers from 1 to 50, but skip multiples of 10.
// [ that means any number if you devide by 10  remainder should not be 0 ]

class program10
{
    public static void main(String arg[])
    {
        for(int i = 1; i <= 30; i++)
        {
            if(i%10 == 0)
            {
                System.err.println("Multiple of 10");
                continue;
            }
            System.out.println(i);
        }
    }
}