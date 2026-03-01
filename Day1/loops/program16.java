// Write a Java program to print numbers from 1 to 50, without prime numbers.

class program16
{
    public static void DisplayPrime()
    {
        for(int i = 1; i <= 50; i++)
        {
            boolean bFlag = true;
            
            for(int j = 2; j < i; j++)
            {
                if(i%j == 0)
                {
                    bFlag = false;
                    break;
                }
            }
            if(bFlag && i > 1)
            {
                continue;
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String arg[])
    {
        DisplayPrime();
    }
}