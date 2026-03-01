// Write a Java program to print numbers from 1 to 100, but stop printing when the number becomes 50.

class program1
{
    public static void main(String arg[])
    {
        for(int i = 0; i<= 100; i++)
        {
            if(i == 50)
            {
                System.out.println("Number 50 encountered, stopping...");
                continue;
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}