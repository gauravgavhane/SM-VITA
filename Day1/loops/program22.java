// Write a Java program to print numbers from 1 to 50, but skip numbers where sum of digits is even.

class program22
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 50; i++)
        {
            int sum = 0;
            int digit = i;
            while(digit != 0)
            {
                sum = sum + (digit % 10);
                digit = digit / 10;
            }
            if(sum%2 == 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}