// Write a Java program that prints numbers from 1 to 20, but stops when a number divisible by 4 and 6 is found.

class program5
{
    public static void main(String[] args) 
    {
        for(int i = 1; i<= 20; i++)
        {
            if((i%4 == 0) && (i%6 == 0))
            {
                System.out.println("Number divisible by 4 and 6" );
                break;
            }
            System.out.println(i);
        }    
    }
}